import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException
	{	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int k = sc.nextInt();
		
		if(k < m)
		{
			System.out.printf("%d %d", 0, k);
		}
		else
		{
			System.out.printf("%d %d", k/m, k%m);
		}
	}
}