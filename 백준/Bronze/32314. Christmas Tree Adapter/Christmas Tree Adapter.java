import java.io.*;
import java.util.*;

public class Main {
	
	
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(); //ampere
		int w = sc.nextInt(); //watt
		int v = sc.nextInt(); //volt
		
		if(w/v >= a)
			System.out.println(1);
		else
			System.out.println(0);
		
	}
}
