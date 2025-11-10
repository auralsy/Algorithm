import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int a = 1;
        int b = 1;
        int c = 1;
        
        for(int i = 1; i <= n; i++)
        {
            a *= i;
        }
        
        for(int i = 1; i <= k; i++)
        {
            b *= i;
        }
        
        for(int i = 1; i <= (n-k); i++)
        {
            c *= i;
        }

        System.out.println(a/(b*c));
    }
}