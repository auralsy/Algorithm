import java.io.*;
import java.util.*;

public class Main {

    public static boolean checkPrime(int n)
    {
        if(n < 2)
            return false;

        for(int i = 2; i*i <= n; i++)
        {
            if(n%i == 0)
                return false;
        }
        return true;
    }

    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int sum = 0;
        int sub = m-n;
        
        boolean ex = false;

        for(int i = n; i <= m; i++)
        {
            if(checkPrime(i))
            {
                sum += i;

                if((i - n) <= sub)
                    sub = i-n;
            }
        }
        
        for(int i = n; i <= m; i++)
        {
            if(checkPrime(i))
            {
                ex = true;
                break;
            }
        }
        
        if(ex == true)
        {
            System.out.println(sum);
            System.out.println(sub + n);
        }
        else
            System.out.println(-1);
    }
}