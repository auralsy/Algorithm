import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            String str = st.nextToken();

            for(int j = 0; j < str.length(); j++)
            {
                for(int t = 0; t < num; t++)
                {
                    sb.append(str.charAt(j));
                }
            }

            sb.append('\n');
        }
        System.out.println(sb);
    }
    }