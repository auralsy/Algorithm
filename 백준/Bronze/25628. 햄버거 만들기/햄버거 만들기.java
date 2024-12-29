import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if(a >= 2 * b)
        {
        	System.out.println(b);
        }
        else
        {
        	if(a > b && a < 2*b)
        	{
        		System.out.println(a/2);
        	}
        	else if(a == b)
        	{
        		System.out.println(a/2);
        	}
        	else if(a < b)
        	{
        		System.out.println(a/2);
        	}
        }
        		
        
    }
}