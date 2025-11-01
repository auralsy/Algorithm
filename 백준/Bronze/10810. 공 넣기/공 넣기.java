import java.util.*;
import java.lang.Math;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        int[] count = new int[3];

        for(int k = 0; k < m; k++) {
            for (int i = 0; i < 3; i++) {
                count[i] = sc.nextInt();
            }
            for (int j = count[0]; j <= count[1]; j++) {
                arr[j - 1] = count[2];
            }
        }
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i]);
            System.out.print(' ');
        }
    }
}