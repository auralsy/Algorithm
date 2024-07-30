import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();
		
		int a, b;
		
		a = x / 10;
		b = x % 10;
		
		if(a == b)
			System.out.println(1);
		else
			System.out.println(0);
	}
}