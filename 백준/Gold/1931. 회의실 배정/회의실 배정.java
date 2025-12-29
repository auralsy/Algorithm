import java.io.*;
import java.util.*;

public class Main {

    public static void main(String args[]) throws IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());

            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        // 여기서 정의할 때 arr 넣어놨으니까 바로 정렬 되는거임. 뒤에 따로 할 필요 x
        Arrays.sort(arr, (o1, o2) -> {
            if(o1[1] == o2[1])
            {
                return o1[0] - o2[0];
            }
            return o1[1] - o2[1];
        });

        int count = 1;
        int temp = arr[0][1];

        for(int i = 1; i < n; i++)
        {
            if(arr[i][0] >= temp)
            {
                count++;
                temp = arr[i][1];
            }
        }

        System.out.println(count);
        }
    }