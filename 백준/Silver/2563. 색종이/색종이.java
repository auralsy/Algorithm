import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        boolean[][] arr = new boolean[100][100];
        int count = 0;

        for(int i = 0; i < n; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int ls = Integer.parseInt(st.nextToken());
            int bs = Integer.parseInt(st.nextToken());

            for(int j = ls; j <= (ls+9); j++)
            {
                for(int t = bs; t <= (bs+9); t++)
                {
                    arr[t][j] = true;
                }
            }
        }

        for(int i = 0; i < 100; i++)
        {
            for(int j = 0; j < 100; j++)
            {
                if(arr[i][j] == true)
                    count++;
            }
        }

        System.out.println(count);
    }
    }