import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main {
	
	
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		
		BigInteger big1 = sc.nextBigInteger();
		BigInteger big2 = sc.nextBigInteger();
		
		System.out.println(big1.add(big2));
	}
}