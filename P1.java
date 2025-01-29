class Program 
{
	public static void main(String[] args) {
		int[] arr = {4, 7, 9, 1, 3, 0, 5};

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] < arr[j + 1]) {  
					int temp = arr[j];
					arr[j] = arr[j + 1];  
					arr[j + 1] = temp;    
				}
			}
		}

		for (int x : arr) {
			System.out.println(x);
		}
	}
}
