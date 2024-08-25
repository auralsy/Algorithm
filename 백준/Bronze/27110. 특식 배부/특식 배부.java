import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int sum = 0;
		
		if(n <= a)
			sum = sum + n;
		else
			sum = sum + a;
		
		if(n <= b)
			sum = sum +n;
		else
			sum = sum + b;
		
		if(n <= c)
			sum = sum + n;
		else
			sum = sum + c;
			
		
		System.out.println(sum);
	}

}
