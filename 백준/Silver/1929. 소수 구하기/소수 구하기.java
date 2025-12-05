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
    public static boolean check_prime(int a) {
        if(a == 1)
            return false;

        for(int i = 2; i*i <= a; i++)
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
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for(int i = n; i <= m; i++)
        {
            if(check_prime(i))
            {
                sb.append(i).append('\n');
            }
        }

        System.out.println(sb);
        }
    }