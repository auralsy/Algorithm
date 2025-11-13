import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;

        int[] arr = new int[a];

        for(int i = 0; i < a; i++)
        {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < (a-2); i++)
        {
            for(int j = (i+1); j < (a-1); j++)
            {
                for(int t = (j+1); t < a; t++)
                {
                    int k = arr[t] + arr[j] + arr[i];

                    if(k <= b)
                    {
                        if(sum <= k)
                            sum = k;
                    }
                }
            }
        }

        System.out.println(sum);
    }
}