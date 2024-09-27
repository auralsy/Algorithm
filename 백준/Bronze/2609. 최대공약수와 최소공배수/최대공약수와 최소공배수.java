import java.util.Scanner;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int s = 1, d = 1;
		
		if(a > b)
		{
			if(a % b == 0)
			{
				d = b;
				s = a;
			}
			else
			{
				for(int i = 2; i < b; i++)
				{
					if((a % i == 0) && (b % i == 0))
					{
						d = i;
					}
				}
				
				s = (a*b)/d;
			}
		}
		else if(a < b)
		{
			if(b % a == 0)
			{
				d = a;
				s = b;
			}
			else
			{
				for(int i = 2; i < a; i++)
				{
					if((a % i == 0) && (b % i == 0))
					{
						d = i;
					}
				}
				
				s = (a*b)/d;
			}
		}
		else
		{
			d = a;
			s = b;
		}
		System.out.println(d);
		System.out.println(s);

	}
}
