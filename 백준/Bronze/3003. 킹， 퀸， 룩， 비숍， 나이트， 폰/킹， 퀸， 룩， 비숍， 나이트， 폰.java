import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);

        int[] cri = new int[]{1, 1, 2, 2, 2, 8};

        int[] arr = new int[6];

        for(int i = 0; i < 6; i++)
        {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < 6; i++)
        {
            cri[i] -= arr[i];
        }

        for(int i = 0; i < 6; i++)
        {
            System.out.print(cri[i] + " ");;
        }
    }
}