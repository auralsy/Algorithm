import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a+b+c <= 21)
			System.out.println(1);
		else
			System.out.println(0);
	}
}
