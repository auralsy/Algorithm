import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if(a == b && b == c)
        {
        	System.out.println(0);
        }
        else if(c >= b && c > a)
        {
        	System.out.println(2*c - b - a);
        }
    }
}