import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringBuilder sb = new StringBuilder();

        int n = Integer.valueOf(br.readLine());
        int count = 1;
        int sum = 1;

        int[] arr = new int[n+1];

        for(int i = 1; i <= n; i++)
        {
            arr[i] = i;
        }

        int startIndex = 1;
        int endIndex = 1;

        while(endIndex != n)
        {
            if(sum < n)
            {
                endIndex++;
                sum += arr[endIndex];
            }
            else if(sum == n)
            {
                endIndex++;
                sum += arr[endIndex];
                count++;
            }
            else
            {
                sum -= arr[startIndex];
                startIndex++;
            }
        }

        System.out.println(count);
        }
    }