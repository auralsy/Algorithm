import java.io.*;
import java.util.*;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        int[] arr = new int[26];
        for(int i = 0; i < 26; i++)
        {
            arr[i] = -1;
        }

        for(int i = 0; i < str.length(); i++)
        {
            char c = str.charAt(i);

            // a의 아스키코드 값 뺀 결과가 알파벳 별 위치
            // 알파벳이 '처음' 나온 위치 기준이므로 -1일 때만 초기화
            if(arr[c - 'a'] == -1)
                arr[c - 'a'] = i;
        }

        for(int n : arr)
        {
            System.out.print(n + " ");
        }
    }
}