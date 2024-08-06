import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int u = 1, d = 1;
		int f;
		
		if(k == 0)
			f = 1;
		else
		{
			for(int i = 0; i < k; i++)
			{
				u = u*(n-i);
				d = d*(k-i);
			}
			f = u / d;
		}
		System.out.println(f);
	}

}
