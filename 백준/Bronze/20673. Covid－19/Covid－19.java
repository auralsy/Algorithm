import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a <= 50 && b <= 10)
			System.out.println("White");
		else if(b > 30)
			System.out.println("Red");
		else
			System.out.println("Yellow");
		
		
	}
}