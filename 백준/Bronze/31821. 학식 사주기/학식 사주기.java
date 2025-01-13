import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int price_sum = 0;
		
		int[] price = new int[n];
		
		for(int i = 0; i < n; i++)
		{
			price[i] = sc.nextInt();
		}
		
		int k = sc.nextInt();
		
		for(int i = 0; i < k; i++)
		{
			int t = sc.nextInt();
			
			price_sum += price[t-1];
		}
		
		System.out.println(price_sum);
	}

}