import java.util.*;
import java.lang.Math;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        for(int i = 0; i < n; i++)
        {
            if(max < arr[i])
                max = arr[i];
        }

        double[] real = new double[n];

        for(int i = 0; i < n; i++)
        {
            real[i] = (double)arr[i]/max*100;
        }

        double sum = 0;

        for(int i = 0; i < n; i++)
        {
            sum += real[i];
        }
        double ave = sum/n;

        System.out.println(ave);
    }
}