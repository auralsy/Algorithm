import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main {
	
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.printf("%d %d", 2*(n+1), 3*(n+1));
	}
}