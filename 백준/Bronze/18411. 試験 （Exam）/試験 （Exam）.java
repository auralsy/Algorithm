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
		
		int a_b = a + b;
		int a_c = a + c;
		int b_c = b + c;
		
		int fi = 0;
		
		if(a_b > a_c)
		{
			if(a_b >= b_c)
				fi = a_b;
			else if(a_b < b_c)
				fi = b_c;
		}
		else
		{
			if(a_c >= b_c)
				fi = a_c;
			else if(a_c < b_c)
				fi = b_c;
		}
		
		System.out.println(fi);
	}
}
