import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main {
	
	public static void main(String[] args) throws IOException
	{	
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		String mbti = br.readLine();
		int n = Integer.parseInt(br.readLine());
		
		int count = 0;
		
		String[] arr = new String[n];
		
		for(int i = 0; i < n; i++)
		{
			arr[i] = br.readLine();
		}
		
		for(int i = 0; i < n; i++)
		{
			if(mbti.equals(arr[i]))
			{
				count++;
			}
		}
		
		System.out.println(count);
	}
}