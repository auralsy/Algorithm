import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException
	{	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int rest = 8 * (n-1);
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		
		for(int i = 0; i < n; i++)
		{
			sum += arr[i];
		}
		
		sum += rest;
		
		if(sum < 24)
		{
			System.out.printf("%d %d", 0, sum);
		}
		else if(sum == 24)
		{
			System.out.printf("%d %d", 1, 0);
		}
		else
		{
			System.out.printf("%d %d", (sum/24), (sum%24));
		}
	}
}