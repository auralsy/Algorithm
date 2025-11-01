import java.util.*;
import java.lang.Math;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[9];

        for(int i = 0; i < 9; i++)
        {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        int max = arr[0];

        for(int i = 1; i < 9; i++)
        {
            if(max < arr[i])
            {
                max = arr[i];
                count = i;
            }
        }

        System.out.println(max);
        System.out.println(count+1);
    }
}