import java.io.*;
import java.util.*;

public class Main {
    public static long GCD(long a, long b) {
        if(b == 0)
            return a;
        else
            return GCD(b, a%b);
    }

    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringBuilder sb = new StringBuilder();

        long a = sc.nextLong();
        long b = sc.nextLong();

        long mid = GCD(a, b);

        System.out.println(a*b/mid);
        }
    }