import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 1; i <= n; i++)
        {
            int w = sc.nextInt();
            int e = sc.nextInt();
            
            int k = Math.min(w, e-w);
            
            Long result = 1L;

            for(int j = 0; j < k; j++)
            {
                result *= (e-j);
                result /= (j+1);
            }
            System.out.println(result);
        }
    }
}