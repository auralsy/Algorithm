import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main {
	
	//registration fee -> 4000 per team
	//
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int f_fee = (4000 * n);
		
		System.out.println(f_fee);
	}
}
