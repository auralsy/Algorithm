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

        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = sc.nextInt();
        int d = sc.nextInt();

        int k = b*d/GCD(b, d);

        int r1 = a*(k/b) + c*(k/d);

        int lastGCD = GCD(r1, k);
        
        System.out.printf("%d %d", r1/lastGCD, k/lastGCD);
        }
    }