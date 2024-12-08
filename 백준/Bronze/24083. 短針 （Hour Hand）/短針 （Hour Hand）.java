import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main {
	
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int sum = n+m;
		
		if(sum > 12)
		{
			if(sum%12 == 0)
			{
				sum = 12;
			}
			else
			{
				sum = sum%12;
			}
		}
		
		System.out.println(sum);
	}
}