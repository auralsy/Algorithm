import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int m = 0;
		
		if(a%2 == 0)
		{
			m = (a/2);
		}
		else
			m = (a/2) + 3;
		
		System.out.println(m);
	}
}