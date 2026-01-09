import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
        {
            arr[i] = Integer.parseInt(br.readLine());
        }

        while(true)
        {
            boolean signal = false;

            for(int i = 0; i < n-1; i++)
            {
                if(arr[i] > arr[i+1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    signal = true;
                }
            }

            if(!signal)
                break;
        }

        for(int i = 0; i < n; i++)
            sb.append(arr[i]).append('\n');

        System.out.println(sb);
    }
    }