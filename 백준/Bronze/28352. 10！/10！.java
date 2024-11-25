import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main {
	
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long k = 1;
		;
		
		for(int i = 1; i <= n; i++)
		{
			k = k * i;
			
			
		}
		long t = k/(60*60*24*7);
		
		System.out.println(t);
	}
}
