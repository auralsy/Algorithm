import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main {
	
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		int M = 0;
		int O = 0;
		int B = 0;
		int I = 0;
		int S = 0;
		
		for(int i = 0; i < str.length(); i++)
		{
			if(str.charAt(i) == 'M')
			{
				M = 1;
			}
			else if(str.charAt(i) == 'O')
			{
				O = 1;
			}
			else if(str.charAt(i) == 'B')
			{
				B = 1;
			}
			else if(str.charAt(i) == 'I')
			{
				I = 1;
			}
			else if(str.charAt(i) == 'S')
			{
				S = 1;
			}
		}
		
		if(M == 1 && O == 1 && B == 1 && I == 1 && S == 1)
		{
			System.out.println("YES");
		}
		else
			System.out.println("NO");
	}
}
