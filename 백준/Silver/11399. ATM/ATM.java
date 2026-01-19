import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringBuilder sb = new StringBuilder();

        // 정렬하고 더하기 (더할때는 중간합 + 현재값)

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int finalSum = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++)
        {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 1; i < n; i++)
        {
            int target = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > target)
            {
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = target;
        }

        for(int i = 0; i < n; i++)
        {
            finalSum += arr[i]*(n-i);
        }

        System.out.println(finalSum);
    }
    }