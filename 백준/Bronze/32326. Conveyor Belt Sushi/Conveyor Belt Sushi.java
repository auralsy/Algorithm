import java.io.*;
import java.util.*;

public class Main {
	
	
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		
		int r = sc.nextInt();
		int g = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(r*3 + g*4 + b*5);
	}
}