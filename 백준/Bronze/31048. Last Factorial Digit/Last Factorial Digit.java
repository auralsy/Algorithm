import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException
	{	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int k;
		
		for(int i = 0; i < n; i++)
		{
			k = sc.nextInt();
			int l = 1;
			for(int j = 1; j <= k; j++)
			{
				l *= j;
			}
			
			if(l < 10)
			{
				System.out.println(l);
			}
			else
			{
				System.out.println(l%10);
			}
		}
	}
}