import java.io.*;
import java.util.*;

public class Main {

    public static void main(String args[]) throws IOException {
        //Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int t = Integer.parseInt(st.nextToken());

        for(int i = 0; i < t; i++)
        {
            st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());

            int total = 0;

            for(int j = 0; j < n; j++)
            {
                total += (a + d*j);
            }

            sb.append(total).append('\n');
        }
        System.out.println(sb);
        }
    }