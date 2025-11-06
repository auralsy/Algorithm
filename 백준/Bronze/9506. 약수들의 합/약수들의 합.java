import java.io.*;
import java.util.*;

public class Main {

    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);

        while(true)
        {
            int n = sc.nextInt();

            if(n == -1)
                break;

            int sum = 0;
            int ind = 0;
            int[] arr = new int[n];

            for(int i = 1; i < n; i++)
            {
                if(n%i == 0)
                {
                    arr[ind++] = i;
                    sum += i;
                }
            }

            if(sum == n)
            {
                System.out.printf("%d = ", n);
                for(int i = 0; i < ind-1; i++)
                {
                    System.out.printf("%d + ", arr[i]);
                }
                System.out.println(arr[ind-1]);
            }
            else
            {
                System.out.printf("%d is NOT perfect.\n", n);
            }
        }
    }
}