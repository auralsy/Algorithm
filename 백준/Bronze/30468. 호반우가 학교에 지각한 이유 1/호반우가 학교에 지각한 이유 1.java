import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		
		int str = sc.nextInt();
		int dex = sc.nextInt();
		int in = sc.nextInt();
		int luk = sc.nextInt();
		int n = sc.nextInt();
		
		int ave = (str+dex+in+luk)/4;
		
		if(ave >= n)
		{
			System.out.println(0);
		}
		else if(ave < n)
		{
			System.out.println((n*4) - (str+dex+in+luk));
		}
	}
}