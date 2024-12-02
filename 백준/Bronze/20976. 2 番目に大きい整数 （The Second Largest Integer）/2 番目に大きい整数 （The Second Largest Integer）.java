import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main {
	
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int mid = a;
		
		if(mid <= b && mid >= c)
			mid = a;
		else if(mid >= b && mid <= c)
			mid = a;
		
		if(mid <= b && mid <= c)
		{
			if(b >= c)
				mid = c;
			else if(b < c)
				mid = b;
		}
		
		if(mid >= b && mid >= c)
		{
			if(b >= c)
				mid = b;
			else if(b < c)
				mid = c;
		}
		
		System.out.println(mid);
	}
}