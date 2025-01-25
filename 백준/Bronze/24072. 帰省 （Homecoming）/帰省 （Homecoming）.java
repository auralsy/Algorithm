import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException
	{	
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(c < a || c > b)
		{
			System.out.println(0);
		}
		else if(c == a)
		{
			System.out.println(1);
		}
		else if(c == b)
		{
			System.out.println(0);
		}
		else
		{
			System.out.println(1);
		}
	}
}