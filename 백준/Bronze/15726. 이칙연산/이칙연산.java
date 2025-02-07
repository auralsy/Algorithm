import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException
	{	
		Scanner sc = new Scanner(System.in);
		
		Double a = sc.nextDouble();
		Double b = sc.nextDouble();
		Double c = sc.nextDouble();
		
		long result1 = (long)((a * b) / c);
		long result2 = (long)((a / b) * c);
		
		System.out.println(Math.max(result1, result2));
	}
}