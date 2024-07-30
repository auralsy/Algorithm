import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		int k = scanner.nextInt();
		
		int f = 1;
		
		for(int i = 1; i <= k; i++)
		{
			f = f * i;
		}
		
		System.out.println(f);
	}
}