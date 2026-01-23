import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        quickSort(arr, 0, n-1, k-1);

        System.out.println(arr[k-1]);
    }

    public static void quickSort(int[] a, int s, int e, int k)
    {
        if(s < e)
        {
            int pivot = partition(a, s, e);

            if(pivot == k)
                return;
            else if(k < pivot)
                quickSort(a, s, pivot-1, k);
            else
                quickSort(a, pivot+1, e, k);
        }
    }

    public static int partition(int[] a, int s, int e)
    {
        if(s+1 == e)
        {
            if(a[s] > a[e])
                swap(a, s, e);
            return e;
        }

        int m = (s+e)/2;
        swap(a, s, m);
        int pivot = a[s];
        int i = s+1, j = e;

        while(i <= j)
        {
            while(j >= s+1 && pivot < a[j])
                j--;
            while(i <= e && pivot > a[i])
                i++;

            if(i <= j)
            {
                swap(a, i++, j--);
            }
        }

        a[s] = a[j];
        a[j] = pivot;
        return j;
    }

    public static void swap(int[] a, int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    }