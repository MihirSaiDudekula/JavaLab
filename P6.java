abstract class Bank
{
	int no;
	String name;
	double bal;

	public Bank(int n,String na,double b)
	{
		this.no=n;
		this.name=na;
		this.bal=b;
	}

	public void display()
	{
		System.out.println(no);
		System.out.println(name);
		System.out.println(bal);
	}

	public abstract void calcI();
}

class SBI extends Bank
{
	public SBI(int no,String name,double bal)
	{
		super(no,name,bal);
	}

	float i = 5;
	public void calcI()
	{
		System.out.println("interest amt");
		System.out.println(bal*i/100);
		System.out.println("details ");
		display();
	}
}

class Program
{
	public static void main(String[] args) {
		SBI obj = new SBI(1,"adam",20);
		obj.calcI();		
	}
}
