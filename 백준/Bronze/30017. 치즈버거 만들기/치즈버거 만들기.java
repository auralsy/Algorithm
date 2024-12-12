import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main {
	
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int size = 0;
		
		if(a - b >= 1)
		{
			size = b * 2 + 1;
		}
		else
		{
			size = a*2 - 1;
		}
		System.out.println(size);
	}
}