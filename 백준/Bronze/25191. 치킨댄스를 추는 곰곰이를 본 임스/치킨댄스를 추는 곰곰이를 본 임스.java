import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main {
	
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int c= sc.nextInt();
		int b = sc.nextInt();
		
		int c_set = c/2;
		
		if(c_set + b >= n)
			System.out.println(n);
		else
			System.out.println(c_set+b);
	}
}