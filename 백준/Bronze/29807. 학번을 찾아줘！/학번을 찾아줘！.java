import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main {
	
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int num;
		
		int arr[] = {0, 0, 0, 0, 0};
		
		for(int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		if(arr[0] > arr[2])
		{
			num = (arr[0] - arr[2]) * 508;
		}
		else
			num = (arr[2] - arr[0]) * 108;
			
		if(arr[1] > arr[3])
		{
			num = num + (arr[1] - arr[3])*212;
		}
		else
			num = num + (arr[3] - arr[1])*305;
		
		num = num + arr[4] * 707;
		
		num = num*4763;
		
		System.out.println(num);
	}
}