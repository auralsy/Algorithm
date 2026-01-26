import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 총 2n-1줄의 출력, 각 줄 별 2n-1개의 별

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n-i; j++)
            {
                sb.append(" ");
            }

            for(int j = 1; j <= 2*i-1; j++)
            {
                sb.append("*");
            }
            sb.append('\n');
        }

        for(int i = n-1; i > 0; i--)
        {
            for(int j = n - i; j > 0; j--)
            {
                sb.append(" ");
            }
            
            for(int j = 2*i-1; j > 0; j--)
            {
                sb.append("*");
            }
            sb.append('\n');
        }

        System.out.println(sb.toString());
    }
    }