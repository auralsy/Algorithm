import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main {
	
	
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int v = n/5;
		int i = n%5;
		
		if(v == 0)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print("I");
			}
		}
		else
		{
			for(int j = 1; j <= v; j++)
			{
				System.out.print("V");
			}
			for(int j = 1; j <= i; j++)
			{
				System.out.print("I");
			}
		}
	}
}
