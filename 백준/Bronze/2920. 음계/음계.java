import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int k = 0;
		
		int[] arr = new int[8];
		
		for(int i = 0; i < 8; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < 7; i++)
		{
			if(arr[i] < arr[i+1])
				k += 1;
			else if(arr[i] > arr[i+1])
				k -= 1;
			else
				k = 0;
		}
		
		if(k == 7)
			System.out.println("ascending");
		else if(k == -7)
			System.out.println("descending");
		else
			System.out.println("mixed");
	}

}
