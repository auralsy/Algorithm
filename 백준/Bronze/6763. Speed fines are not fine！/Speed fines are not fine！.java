import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main {
	
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		
		int ls = sc.nextInt();
		int ns = sc.nextInt();
		
		int k = ns - ls;
		
		if(ls >= ns)
			System.out.println("Congratulations, you are within the speed limit!");
		else
		{
			if(1 <= k && k <= 20)
				System.out.println("You are speeding and your fine is $100.");
			else if(21 <= k && k <= 30)
				System.out.println("You are speeding and your fine is $270.");
			else if(k >= 31)
				System.out.println("You are speeding and your fine is $500.");
		}
			
		
	}
}