import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        long[] arr = new long[n];
        int result = 0;

        for(int i = 0; i < n; i++)
        {
            arr[i] = Long.parseLong(st.nextToken());
        }

        Arrays.sort(arr);

        for(int k = 0; k < n; k++)
        {
            long find = arr[k];
            int i = 0;
            int j = n - 1;
            
            while(i < j)
            {
                if(arr[i] + arr[j] == find)
                {
                    if(i != k && j != k)
                    {
                        result++;
                        break;
                    }
                    else if(i == k)
                    {
                        i++;
                    }
                    else if(j == k)
                    {
                        j--;
                    }
                }
                else if(arr[i] + arr[j] < find)
                    i++;
                else 
                    j--;
            }
        }
        System.out.println(result);
        }
    }