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
        if(a < 1)
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
        
        while(true)
        {
            int n = Integer.parseInt(br.readLine());
            int count = 0;
            
            if(n == 0)
                break;
            
            for(int i = n+1; i <= 2*n; i++)
            {
                if(check_prime(i) == true)
                    count++;
            }
            System.out.println(count);
        }
        }
    }