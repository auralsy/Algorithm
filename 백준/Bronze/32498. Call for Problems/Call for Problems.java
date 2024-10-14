import java.io.*;
import java.util.*;

public class Main {
	
	
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int d;
		int count = 0;
		
		for(int i = 0; i < n; i++)
		{
			d = sc.nextInt();
			
			if(d % 2 != 0)
				count++;
		}
		
		System.out.println(count);
	}
}
