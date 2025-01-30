import java.util.*;

class SharedBuffer
{
	int cap;
	LinkedList<Integer> buffer;

	public SharedBuffer(int n)
	{
		this.cap=n;
		this.buffer=new LinkedList<>();
	}

	public void produce(int i)
	{
		synchronized(buffer)
		{
			// for(int i=0;i<10;i++)
			{
				if(buffer.size()==cap)
				{
					try
					{
						buffer.wait();
					}catch(InterruptedException e)
					{
						System.out.println(e.getMessage());
					}
				}
				buffer.add(i);
				System.out.println(i+" added");
				buffer.notifyAll();
			}
		}
	}

	public void consume()
	{
		synchronized(buffer)
		{
			// for(int i=0;i<10;i++)
			{
				if(buffer.size()==0)
				{
					try
					{
						buffer.wait();
					}catch(InterruptedException e)
					{
						System.out.println(e.getMessage());
					}
				}
				int x = buffer.removeFirst();
				System.out.println(x+" removed");
				buffer.notifyAll();
			}
			
		}
	}
}

class Producer implements Runnable
{
	SharedBuffer s;

	public Producer(SharedBuffer s)
	{
		this.s = s;
	}

	public void run()
	{
		for(int i=0;i<10;i++)
		{
			s.produce(i);
			try{
			Thread.sleep((i+1)*1000);
			}catch(InterruptedException e)
			{
				System.out.println(e.getMessage());
			}
		}
	}

}

class Consumer implements Runnable
{
	SharedBuffer s;

	public Consumer(SharedBuffer s)
	{
		this.s = s;
	}

	public void run()
	{
		// int i = 0;
		for(int i=0;i<10;i++)
		{
			s.consume();
			try{
			Thread.sleep((i+1)*1800);
			}catch(InterruptedException e)
			{
				System.out.println(e.getMessage());
			}
		}
	}
}

class Program
{
	public static void main(String[] args) {
		SharedBuffer s = new SharedBuffer(10);
		Producer p = new Producer(s);
		Consumer c = new Consumer(s);
		new Thread(p).start();
		new Thread(c).start();

		//c.run();

	}
}
