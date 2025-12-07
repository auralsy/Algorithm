import java.io.*;
import java.util.*;

public class Main {
    /*
    public static int GCD(int a, int b) {
        if(b == 0)
            return a;
        else
            return GCD(b, a%b);
    }
*/
    public static boolean check_prime(long a) {
        if(a < 2)
            return false;

        for(long i = 2; i*i <= a; i++)
        {
            if(a % i == 0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) throws IOException {
        //Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringBuilder sb = new StringBuilder();

        boolean[] ech = new boolean[1000001];

        for(int i = 0; i <= 1000000; i++)
        {
            if(check_prime(i))
                ech[i] = true;
        }

        int n = Integer.parseInt(br.readLine());

        while(n --> 0)
        {
            int t = Integer.parseInt(br.readLine());
            int count = 0;
            
            for(int j = 2; j <= t/2; j++)
            {
                if(ech[j] && ech[t-j])
                {
                    count++;
                }
            }
            System.out.println(count);
        }
        }
    }