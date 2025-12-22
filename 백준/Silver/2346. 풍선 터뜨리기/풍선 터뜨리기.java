import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        Deque<int[]> deque = new ArrayDeque<>();
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) 
        {
            int value = Integer.parseInt(st.nextToken());
            deque.offer(new int[] {i, value});
        }

        int[] current = deque.pollFirst(); 
        sb.append(current[0]).append(" ");
        
        int move = current[1];

        while (!deque.isEmpty()) 
        {
            if (move > 0) 
            {
                for (int i = 0; i < (move - 1); i++) 
                {
                    deque.offerLast(deque.pollFirst());
                }
                
                current = deque.pollFirst();
            } 
            else 
            {
                for (int i = 0; i < (-1 * move); i++) 
                {
                    deque.offerFirst(deque.pollLast()); 
                }
             
                current = deque.pollFirst();
            }

            sb.append(current[0]).append(" ");
            move = current[1];
        }

        System.out.println(sb);
    }
}