import java.io.*;
import java.util.*;

public class Main {

    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // 도화지 생성
        boolean[][] bp = new boolean[100][100];

        // 좌측 변, 아래 변 위치
        int[][] arr = new int[n][2];

        for(int i = 0; i < n; i++)
        {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        // 도화지 칠하기
        for(int i = 0; i < n; i++)
        {
            for(int j = arr[i][0]; j <= arr[i][0]+9; j++)
            {
                for(int t = arr[i][1]; t <= arr[i][1]+9; t++)
                {
                    bp[t][j] = true;
                }
            }
        }

        int sum = 0;

        for(int i = 0; i < 100; i++)
        {
            for(int j = 0; j < 100; j++)
            {
                if(bp[i][j] == true)
                    sum += 1;
            }
        }

        System.out.println(sum);
    }
}