import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // long n = sc.nextLong();
        long n = Integer.parseInt(br.readLine());

        long count = 0L;

        // (n-2) + (n-3) + (n-4) + ... + 1
        for(int i = 1; i <= (n-1); i++)
        {
            count += i;
        }

        System.out.println(count);
        System.out.println(2);
    }
}