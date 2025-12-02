import java.io.*;
import java.util.*;

public class Main {
    public static int GCD(int a, int b) {
        if(b == 0)
            return a;
        else 
            return GCD(b, a%b);
    }
    
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();

        for(int i = 0; i < n; i++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            int gcd = GCD(a, b);

            System.out.println(a*b/gcd);
        }
    }
}