import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main {
	
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int tx = 0;
		int ty = 0;
		
		if(n % a == 0)
			tx = (n / a) * b;
		else
			tx = (n / a + 1) * b;
		
		if(n % c == 0)
			ty = (n / c) * d;
		else
			ty = (n / c + 1) * d;
		
		if(tx > ty)
			System.out.println(ty);
		else
			System.out.println(tx);
	}
}