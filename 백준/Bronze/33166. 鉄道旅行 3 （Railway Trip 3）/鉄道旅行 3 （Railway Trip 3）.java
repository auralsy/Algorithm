import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		
		int p = sc.nextInt();
		int q = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int fee = 0;
		
		if(p >= q)
		{
			fee = q * a;
			System.out.println(fee);
		}
		else
		{
			fee = p*a + (q-p)*b;
			System.out.println(fee);
		}
	}
}
