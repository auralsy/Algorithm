import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int t = str.length();
        int[] arr = new int[t];

        for(int i = 0; i < t; i++)
        {
            arr[i] = str.charAt(i) - '0';
        }

        for(int i = 0; i < t; i++)
        {
            for(int j = (i+1); j < t; j++)
            {
                int temp = 0;

                if(arr[i] < arr[j])
                {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        for(int i = 0; i < t; i++)
        {
            System.out.print(arr[i]);
        }
    }
}