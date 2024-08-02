import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int count = 0;
		
		for(int i = 0; i < n; i++)
		{
			if(isprime(arr[i]) == true)
				count++;
		}
		
		System.out.println(count);
		
	}
	
	public static boolean isprime(int n)
	{
		//0, 1은 소수 아님
		if(n <= 1)
			return false;
		//2는 소수 고정
		if(n == 2)
			return true;
		//짝수는 소수 아님
		if(n % 2 == 0)
			return false;
		
		for(int i = 3; i <= Math.sqrt(n); i+=2)
		{
			if(n % i == 0)
				return false;
		}
		return true;
	}

}
