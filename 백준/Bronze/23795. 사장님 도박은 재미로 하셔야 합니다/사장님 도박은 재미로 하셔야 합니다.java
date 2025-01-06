import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n;
		int sum = 0;
		
		do
		{
			n = sc.nextInt();
			sum = sum + n;
		}
		while(n != -1);
		
		System.out.println(sum+1);
	}

}