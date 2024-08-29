import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(n > b)
			System.out.println("Bus");
		else if(n <= b)
		{
			if(a > b)
				System.out.println("Subway");
			else if(a < b)
				System.out.println("Bus");
			else
				System.out.println("Anything");
		}
			
	}
}