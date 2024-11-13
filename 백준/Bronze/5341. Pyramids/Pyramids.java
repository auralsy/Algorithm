import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main {
	
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			int n = sc.nextInt();
			int sum = 0;
			
			if(n == 0)
				break;
			
			for(int i = 1; i <= n; i++)
			{
				sum = sum + i;
			}
			System.out.println(sum);
		}
	}
}