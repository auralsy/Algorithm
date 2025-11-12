import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);

        int w_max = -10000;
        int w_min = 10000;
        int h_max = -10000;
        int h_min = 10000;

        int n = sc.nextInt();
        int count = 0;
        int past_x = 10001;
        int past_y = 10001;

        if(n == 1)
        {
            System.out.println(0);
            return;
        }
            

        for(int i = 0; i < n; i++)
        {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if(w_max < x)
                w_max = x;

            if(w_min > x)
                w_min = x;

            if(h_max < y)
                h_max = y;

            if(h_min > y)
                h_min = y;
            
            if(x == past_x && y == past_y)
                count++;
            
            past_x = x;
            past_y = y;
        }

        int f_w = w_max - w_min;
        int f_h = h_max - h_min;

        if(count == n-1)
            System.out.println(0);

        System.out.println(f_w * f_h);
    }
}