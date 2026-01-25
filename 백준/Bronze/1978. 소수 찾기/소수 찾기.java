import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        String str = br.readLine();
        st = new StringTokenizer(str);
        int count = 0;

        for(int i = 0; i < n; i++)
        {
            int a = Integer.parseInt(st.nextToken());

            if(a == 1)
                continue;
            else if(a == 2)
            {
                count++;
                continue;
            }
            else
            {
                if(checkPrime(a))
                {
                    count++;
                }
            }
        }

        System.out.println(count);
    }

    static boolean checkPrime(int a)
    {
        for(int i = 2; i*i <= a; i++)
        {
            if(a%i == 0)
            {
                return false;
            }
        }
        return true;
    }
    }