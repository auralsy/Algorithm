import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException
	{	
		Scanner sc = new Scanner(System.in);
		
		int s = sc.nextInt();
		int k = sc.nextInt();
		int h = sc.nextInt();
		
		int sum = s + k + h;
		int min = s;
		
		if(sum >= 100)
		{
			System.out.println("OK");
		}
		else
		{
			if(min > k)
				min = k;
			
			if(min > h)
				min = h;
			
			if(min == s)
			{
				System.out.println("Soongsil");
			}
			
			if(min == k)
			{
				System.out.println("Korea");
			}
			
			if(min == h)
				System.out.println("Hanyang");
		}
	}
}