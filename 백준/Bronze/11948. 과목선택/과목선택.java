import java.io.*;
import java.util.*;

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
		
		int mof = a;
		int mot = e;
		
		if(mof > b)
			mof = b;
		if(mof > c)
			mof = c;
		if(mof > d)
			mof = d;
		if(mot > f)
			mot = f;
		
		int sum = a+b+c+d+e+f;
		
		System.out.println(sum - mof - mot);
	}
}