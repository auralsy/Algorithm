import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();

        int fx = 0;
        int fy = 0;

        for(int x = -999; x <= 999; x++)
        {
            for(int y = -999; y <= 999; y++)
            {
                if(a*x + b*y == c)
                {
                    if(d*x + e*y == f)
                    {
                        fx = x;
                        fy = y;
                        break;
                    }
                }
            }
        }
        
        System.out.printf("%d %d", fx, fy);
    }
}