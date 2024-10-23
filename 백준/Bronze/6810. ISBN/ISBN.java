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
		
		String str = "The 1-3-sum is ";
		
		int sum =  91 + a*1 + b*3 + c*1;
		
		System.out.printf("%s%d", str, sum);
	}
}
