import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a > b && a < c)
			System.out.println(a);
		else if(a > c && a < b)
			System.out.println(a);
		
		if(b > a && b < c)
			System.out.println(b);
		else if(b > c && b < a)
			System.out.println(b);
		
		if(c > b && c < a)
			System.out.println(c);
		else if(c > a && c < b)
			System.out.println(c);
	}

}