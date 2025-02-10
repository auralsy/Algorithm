import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException
	{	
		Scanner sc = new Scanner(System.in);
		
		
		while(true)
		{
			Double a = sc.nextDouble();
			Double b = sc.nextDouble();
			
			if (a == 0.0 && b == 0.0) 
			{
                System.out.println("AXIS");
                break;
            }
			
			if (a == 0.0 || b == 0.0) 
			{
                System.out.println("AXIS");
            } 
			else if (a > 0.0 && b > 0.0) 
            {
                System.out.println("Q1");
            } 
			else if (a < 0.0 && b > 0.0) 
			{
                System.out.println("Q2");
            } 
			else if (a < 0.0 && b < 0.0) 
			{
                System.out.println("Q3");
            } 
			else if (a > 0.0 && b < 0.0) 
			{
                System.out.println("Q4");
            }
		}
	}
}