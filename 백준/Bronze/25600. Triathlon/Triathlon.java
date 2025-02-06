import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException
	{	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int a, d, g;
		
		int max = 0;
		int resul = 0;
		
		for(int i = 0; i < n; i++)
		{
			a = sc.nextInt();
			d = sc.nextInt();
			g = sc.nextInt();
			
			resul = a*(d+g);
			
			if(a == (d+g))
			{
				resul *= 2;
			}
			
			if(resul > max)
				max = resul;
		}
		
		System.out.println(max);
	}
}