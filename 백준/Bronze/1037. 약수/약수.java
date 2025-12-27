import java.io.*;
import java.util.*;

public class Main {

    public static void main(String args[]) throws IOException {
        //Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st.nextToken());
        int resu = 0;

        st = new StringTokenizer(br.readLine());

        if(num == 1)
        {
            resu = Integer.parseInt(st.nextToken());
            resu *= resu;
        }
        else
        {
            int[] arr = new int[num];

            for(int i = 0; i < num; i++)
            {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            int max = arr[0];
            int min = arr[0];

            for(int j = 0; j < num; j++)
            {
                if(arr[j] > max)
                    max = arr[j];

                if(arr[j] < min)
                    min = arr[j];
            }
            resu = max * min;
        }

        System.out.println(resu);
        }
    }