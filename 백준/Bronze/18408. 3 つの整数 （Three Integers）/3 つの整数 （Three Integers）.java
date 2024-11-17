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
		
		if(a == b)
		{
			if(a == 1)
				System.out.println(1);
			else if(a == 2)
			System.out.println(2);
		}
		else if(a == c)
		{
			if(a == 1)
				System.out.println(1);
			else if(a == 2)
				System.out.println(2);
		}
		else if(b == c)
		{
			if(b == 1)
				System.out.println(1);
			else if(b == 2)
				System.out.println(2);
		}
	}
}