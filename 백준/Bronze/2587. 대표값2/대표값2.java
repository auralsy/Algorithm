import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for(int i = 0; i < 5; i++)
        {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < 5; i++)
        {
            for(int j = i; j < 5; j++)
            {
                if(arr[i] > arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        int ave = 0;
        
        for(int i = 0; i < 5; i++)
        {
            ave += arr[i];
        }

        System.out.println(ave/5);
        System.out.println(arr[2]);
    }
}