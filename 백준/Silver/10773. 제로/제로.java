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
    /*
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
*/

    public static void main(String args[]) throws IOException {
        //Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringBuilder sb = new StringBuilder();

        Stack<Long> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());
        long result = 0;

        for(int i = 0; i < n; i++)
        {
            long m = Long.parseLong(br.readLine());

            if(m == 0L)
            {
                result -= stack.pop();
            }
            else
            {
                result += stack.push(m);
            }
        }

        System.out.println(result);
        }
    }