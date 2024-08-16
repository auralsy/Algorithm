import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		int x = 0, y = 0;
		
		for(int i = 1; i <= t; i++)
		{
			x = sc.nextInt();
			y = sc. nextInt();
			
			System.out.printf("Case %d: " + "%d", i, x+y);
			System.out.println();
		}
	}

}
