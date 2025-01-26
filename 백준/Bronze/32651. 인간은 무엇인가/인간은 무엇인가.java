import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException
	{	
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		boolean check = false;
		
		int[] arr = new int[49];
		
		for(int i = 0; i < 49; i++)
		{
			arr[i] = 2024*(i+1);
		}
		
		for(int i = 0; i < 49; i++)
		{
			if(arr[i] == a)
			{
				check = true;
				break;
			}
		}
		
		if(check)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
}