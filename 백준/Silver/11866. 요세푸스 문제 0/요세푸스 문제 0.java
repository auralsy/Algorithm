import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        //Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Queue<Integer> que = new LinkedList<>();

        for(int i = 1; i <= n; i++)
        {
            que.add(i);
        }

        sb.append("<");

        while(que.size() > 1)
        {
            for(int i = 0; i < (k-1); i++)
            {
                // 맨 앞 요소 변수에 저장하고 제거
                int val = que.poll();
                // 변수에 저장했던 맨 앞 요소를 맨 뒤에 추가
                que.offer(val);
            }

            sb.append(que.poll()).append(", ");
        }
        // 마지막으로 남은 요소
        sb.append(que.poll()).append(">");

        System.out.println(sb);
        }
    }