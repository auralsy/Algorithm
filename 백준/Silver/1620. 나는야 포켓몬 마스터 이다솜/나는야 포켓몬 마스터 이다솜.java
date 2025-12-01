import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 도감 수록 포켓몬 수 -> n
        // 내가 맞춰야 하는 문제의 개수 -> m
        // n개 줄에 도감 & 다음 m개 줄에 맞춰야 하는 것들
        // 영어 -> 숫자 & 숫자 -> 영어

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> hm1 = new HashMap<String, Integer>();
        HashMap<Integer, String> hm2 = new HashMap<Integer, String>();

        for(int i = 0; i < n; i++)
        {
            String name = br.readLine();
            hm1.put(name, i+1);
            hm2.put(i+1, name);
        }

        for(int i = 0; i < m; i++)
        {
            String what = br.readLine();

            if(Character.isDigit(what.charAt(0)))
            {
                int key = Integer.parseInt(what);
                sb.append(hm2.get(key)).append('\n');
            }
            else
            {
                sb.append(hm1.get(what)).append('\n');
            }
        }

        System.out.println(sb);
    }
}