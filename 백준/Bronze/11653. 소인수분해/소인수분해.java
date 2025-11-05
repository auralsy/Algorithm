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

        if(n == 1)
            return;

        for(int i = 2; i*i <= n; i++)
        {
            if(n < 2)
                break;

            if(checkPrime(i))
            {
                while(n%i == 0)
                {
                    System.out.println(i);
                    n /= i;
                }
            }
        }

        if(n > 1)
            System.out.println(n);
    }
}