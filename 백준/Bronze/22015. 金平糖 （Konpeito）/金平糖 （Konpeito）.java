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
        
        if(a == b && b == c) //다 같을 때
        {
        	System.out.println(0);
        }
        else if(c >= b && c > a) // c가 가장 클 때
        {
        	System.out.println(2*c - b - a);
        }
        else if(b >= c && b > a) // b가 가장 클 때
        {
        	System.out.println(2*b - c - a);
        }
        else if(a >= c && a > b) // a가 가장 클 때
        {
        	System.out.println(2*a - c - b);
        }
        else if(c > b && c >= a) // c가 가장 클 때
        {
        	System.out.println(2*c - b - a);
        }
        else if(b > c && b >= a) // b가 가장 클 때
        {
        	System.out.println(2*b - c - a);
        }
        else if(a > c && a >= b) // a가 가장 클 때
        {
        	System.out.println(2*a - c - b);
        }
    }
}