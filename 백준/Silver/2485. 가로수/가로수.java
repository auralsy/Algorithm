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
        
        int n = sc.nextInt();

        int[] ori = new int[n];
        int[] sub = new int[n-1];

        for(int i = 0; i < n; i++)
        {
            ori[i] = sc.nextInt();
        }

        for(int i = 0; i < n-1; i++)
        {
            sub[i] = ori[i+1] - ori[i];
        }

        int gcd = sub[0];

        for(int i = 1; i < sub.length; i++)
        {
            gcd = GCD(gcd, sub[i]);
        }

        int resu = (ori[n-1] - ori[0])/gcd - (n-1);

        System.out.println(resu);
        }
    }