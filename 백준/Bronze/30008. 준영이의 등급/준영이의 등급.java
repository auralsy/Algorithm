import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException
	{	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int[] arr = new int[k];
		int[] charr = new int[k];
		int g = 0;
		
		for(int i = 0; i < k; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < k; i++)
		{
			charr[i] = (arr[i] * 100)/n;
			
			if(charr[i] <= 4)
				g = 1;
			else if(charr[i] <= 11)
				g = 2;
			else if(charr[i] <= 23)
				g = 3;
			else if(charr[i] <= 40)
				g = 4;
			else if(charr[i] <= 60)
				g = 5;
			else if(charr[i] <= 77)
				g = 6;
			else if(charr[i] <= 89)
				g = 7;
			else if(charr[i] <= 96)
				g = 8;
			else if(charr[i] <= 100)
				g = 9;
				
			System.out.printf("%d ", g);
		}
	}
}