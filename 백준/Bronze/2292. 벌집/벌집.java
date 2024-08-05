import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int k = 1;
		
		for(int i = 1; i < 20000000; i++)
		{
			if(n == 1)
			{
				System.out.println(1);
				break;
			}
			else if(k < n && k + 6*i >= n)
			{
				System.out.println(i+1);
				break;
			}
			else
				k = k + 6*i;
		}
	}
	
}