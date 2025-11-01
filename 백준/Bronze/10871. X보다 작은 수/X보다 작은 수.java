import java.util.*;
import java.lang.Math;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();

        int[] arr1 = new int[n];
        int count = 0;

        for(int i = 0; i < n; i++)
        {
            arr1[i] = sc.nextInt();
            if(arr1[i] < x);
        }

        for(int i = 0; i < n; i++)
        {
            if(arr1[i] < x)
            {
                System.out.print(arr1[i] + " ");
            }
        }
    }
}