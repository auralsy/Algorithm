import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;

        for(int i = 0; i < (n-k+1); i++)
        {
            int sum = 0;
            for(int j = i; j < (k+i); j++)
            {
                sum += arr[j];
            }
            if(max < sum)
                max = sum;
        }

        System.out.println(max);
    }
}