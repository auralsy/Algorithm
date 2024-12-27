import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int d1 = sc.nextInt();
        double d2 = sc.nextInt();
        
        double l = 2 * d1 + (2 * d2 * 3.141592);
        
        System.out.println(l);
    }
}