import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		double f = (double)z + 0.5;
		
		if(x+y > f)
		{
			System.out.println(0);
		}
		else
			System.out.println(1);
	}

}
