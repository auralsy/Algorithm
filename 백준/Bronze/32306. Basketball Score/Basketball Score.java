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
		int d = sc.nextInt();
		int e = sc.nextInt();
		int f = sc.nextInt();
		
		int team_1 = a + 2*b + 3*c;
		int team_2 = d + 2*e + 3*f;
		
		if(team_1 > team_2)
			System.out.println(1);
		else if(team_1 == team_2)
			System.out.println(0);
		else
			System.out.println(2);
	}
}