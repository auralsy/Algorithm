import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException
	{	
		Scanner sc = new Scanner(System.in);
		
		int c1 = sc.nextInt();
		int p1 = sc.nextInt();
		int m1 = sc.nextInt();
		int s1 = sc.nextInt();
		int s11 = sc.nextInt();
		int j1 = sc.nextInt();
		
		int c2 = sc.nextInt();
		int p2 = sc.nextInt();
		int m2 = sc.nextInt();
		int s2 = sc.nextInt();
		int s22 = sc.nextInt();
		int j2 = sc.nextInt();
		
		int sum1 = c1*13 + p1*7 + m1*5 + s1*3 + s11*3 + j1*2;
		int sum2 = c2*13 + p2*7 + m2*5 + s2*3 + s22*3 + j2*2;
		sum2 += 1.5;
		
		if(sum1 > sum2)
		{
			System.out.println("cocjr0208");
		}
		else
			System.out.println("ekwoo");
	}
}