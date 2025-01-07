import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum = 0;
		
		int[][] arr = new int[n][2];
		
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < 2; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < n; i++)
		{
			switch(arr[i][0])
			{
			case 136 :
			{
				sum = sum + 1000;
				break;
			}
			case 142 : 
			{
					sum = sum + 5000;
					break;
			}
			case 148 : 
			{
					sum = sum + 10000;
					break;
			}
			case 154 : 
			{
					sum = sum + 50000;
					break;
			}
			}
		}
		System.out.println(sum);
	}

}