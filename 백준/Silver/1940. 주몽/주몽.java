import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringBuilder sb = new StringBuilder();

        int n = Integer.valueOf(br.readLine());
        int m = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
        {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        
        int count = 0;
        int i = 0;
        int j = n-1;
        
        while(i < j)
        {
            if(arr[i] + arr[j] < m)
                i++;
            else if(arr[i] + arr[j] > m)
                j--;
            else
            {
                count++;
                i++;
                j--;
            }
        }

        System.out.println(count);
        }
    }