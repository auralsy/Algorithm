import java.io.*;
import java.util.*;

public class Main {

    public static void main(String args[]) throws IOException {
        //Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        int sum = 0;

        // 수들을 입력받고 합까지 구하기
        for(int i = 0; i < n; i++)
        {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        // 일단 정렬
        Arrays.sort(arr);
        // 산술 평균
        // round로 반올림 구현
        sb.append(Math.round((double)sum / n)).append('\n');
        // 중앙값
        sb.append(arr[n/2]).append('\n');

        int mode = arr[0];
        int maxCount = 0;
        int currentCount = 0;
        boolean check = false;

        int lastN = arr[0];
        currentCount = 0;

        for(int i = 0; i < n; i++)
        {
            if(arr[i] == lastN)
                currentCount++;
            else
            {
                if(currentCount > maxCount)
                {
                    maxCount = currentCount;
                    mode = lastN;
                    check = true;
                }
                else if(currentCount == maxCount && check)
                {
                    mode = lastN;
                    check = false;
                }

                lastN = arr[i];
                currentCount = 1;
            }
        }
        if(currentCount > maxCount)
        {
            mode = lastN;
        }
        else if(currentCount == maxCount && check)
            mode = lastN;

        sb.append(mode).append('\n');
        
        sb.append(arr[n-1] - arr[0]).append('\n');

        System.out.println(sb);
        }
    }