import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);

        // 1센트 - 0.01$
        int n = sc.nextInt();

        for(int i = 0; i < n; i++)
        {
            int q = 0;
            int d = 0;
            int ni = 0;
            int p = 0;

            int r = sc.nextInt();

            q = r/25;
            d = (r - 25*q)/10;
            ni = (r - 25*q - d*10)/5;
            p = r - 25*q - d*10 - ni*5;

            System.out.printf("%d %d %d %d", q, d, ni, p);
            System.out.println();

        }
    }
}