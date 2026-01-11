import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();

        int[] arr = new int[str.length()];

        for(int i = 0; i < str.length(); i++)
        {
            arr[i] = Integer.parseInt(str.substring(i, i+1));
        }

        for(int i = 0; i < str.length(); i++)
        {
            int max = i;

            for(int j = i+1; j < str.length(); j++)
            {
                if(arr[max] < arr[j])
                    max = j;
            }
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
        }
        for(int i = 0; i < str.length(); i++)
            System.out.print(arr[i]);
    }
    }