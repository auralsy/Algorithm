import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main {
	
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		
		int hh = sc.nextInt();
		int mm = sc.nextInt();
		
		int sum_min = (hh-9)*60 + mm;
		
		System.out.println(sum_min);
	}
}