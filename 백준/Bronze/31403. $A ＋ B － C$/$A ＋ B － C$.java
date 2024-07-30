import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int d, f;
		String e;
		
		d = a + b - c;
		e = ((a + "") + (b + ""));
		
		f = Integer.parseInt(e) - c;
		
		System.out.println(d);
		System.out.println(f);
			
	}
}