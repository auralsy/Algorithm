import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);

        int[] arr1 = new int[3];
        int[] arr2 = new int[3];
        
        int x = 0;
        int y = 0;
        
        for(int i = 0; i < 3; i++)
        {
            arr1[i] = sc.nextInt();
            arr2[i] = sc.nextInt();
        }
        
        if(arr1[0] == arr1[1])
            x = arr1[2];
        else if(arr1[0] == arr1[2])
            x = arr1[1];
        else x = arr1[0];

        if(arr2[0] == arr2[1])
            y = arr2[2];
        else if(arr2[0] == arr2[2])
            y = arr2[1];
        else y = arr2[0];

        System.out.printf("%d %d", x, y);
    }
}