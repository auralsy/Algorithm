import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main {
	
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		for(int i = 0; i < n; i++)
		{
			while(sc.hasNext())
			{
				StringBuilder sb = new StringBuilder(sc.next());
				
				System.out.println(sb.reverse());
			}
		}
		sc.close();
	}
}