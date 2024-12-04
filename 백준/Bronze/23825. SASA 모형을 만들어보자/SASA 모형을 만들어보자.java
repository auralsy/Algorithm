import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main {
	
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		
		int s = sc.nextInt();
		int a = sc.nextInt();
		
		int s_l = s / 2;
		int a_l = a / 2;
		
		int n = 0;
		
		if(s_l > a_l)
		{
			n = a_l;
		}
		else if(s_l < a_l)
		{
			n = s_l;
		}
		else
		{
			n = s_l;
		}
		
		System.out.println(n);
	}
}