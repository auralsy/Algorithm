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
		
		if(a == b && b == c)
			System.out.println("*");
		else if(a == b && b != c)
			System.out.println("C");
		else if(b == c && a != b)
			System.out.println("A");
		else if(a == c && a != b)
			System.out.println("B");
	}
}