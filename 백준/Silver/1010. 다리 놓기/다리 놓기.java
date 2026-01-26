import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            int k = Math.min(r, n-r);
            long result = 1l;
            
            for(int j = 0; j < k; j++)
            {
                result *= (n-j);
                result /= (j+1);
            }

            sb.append(result).append('\n');
        }

        System.out.println(sb);
    }
    }