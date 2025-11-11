import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);

        while(true)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int sum = a+b+c;

            if(a==0 && b==0 && c==0)
                break;

            int max = a;
            if(max < b)
                max = b;
            if(max < c)
                max = c;

            if(max >= (sum-max))
                System.out.println("Invalid");
            else if((a==b && b!=c) || (a==c && c!=b) || (b==c && b!=a))
                System.out.println("Isosceles");
            else if(a==b && b==c)
                System.out.println("Equilateral");
            else
                System.out.println("Scalene");
        }

    }
}