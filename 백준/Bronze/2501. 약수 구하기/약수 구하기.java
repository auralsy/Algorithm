import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n+1];
        int count = 0;

        for(int i = 1; i <= n; i++)
        {
            if(n%i == 0)
            {
                count++;

                if(count == k)
                {
                    System.out.println(i);
                    break;
                }
            }

            if(i == n)
                System.out.println(0);

        }
    }
    }