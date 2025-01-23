import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		long mad = 0;
		long mid = 0;
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n; i++)
		{
			if(arr[i] == 0)
			{
				mid -= 1;
				mad += mid;
			}
			else if(arr[i] == 1)
			{
				mid += 1;
				mad += mid;
			}
		}
		System.out.println(mad);
		
	}
}