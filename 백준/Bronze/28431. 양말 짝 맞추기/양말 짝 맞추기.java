import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException
	{	
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		int rest = 0;
		
		for(int i = 0; i < 5; i++)
		{
			arr[i] = sc.nextInt();
		}
		int i;
		for(i = 0; i < 5; i++)
		{
			int count = 0;
			for(int j = 0; j < 5; j++)
			{
				if(arr[i] == arr[j])
				{
					count++;
				}
			}
			if(count % 2 == 1)
			{
				break;
			}
		}
		System.out.println(arr[i]);
	}
}