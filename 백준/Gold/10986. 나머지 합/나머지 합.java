import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        long[] s = new long[n];
        long[] c = new long[m];

        long answer = 0;

        st = new StringTokenizer(br.readLine());
        s[0] = Integer.parseInt(st.nextToken());

        for (int i = 1; i < n; i++) {
            s[i] = s[i - 1] + Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            int rema = (int) (s[i] % m);

            if (rema == 0)
                answer++;

            c[rema]++;
        }

        for (int i = 0; i < m; i++) {
            if (c[i] > 1)
                answer = answer + (c[i] * (c[i] - 1) / 2);
        }
        System.out.println(answer);
    }
    }