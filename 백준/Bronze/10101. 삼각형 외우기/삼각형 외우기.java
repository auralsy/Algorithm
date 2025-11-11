import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        boolean check = false;
        
        int sum = a + b + c;
        
        if(sum != 180)
        {
            System.out.println("Error");
        }
        else
        {
            if(a == b && b == c)
                System.out.println("Equilateral");
            else if((a==b && b != c) || (a==c && a != b) || (b==c && b != a))
                System.out.println("Isosceles");
            else
                System.out.println("Scalene");
        }
    }
}