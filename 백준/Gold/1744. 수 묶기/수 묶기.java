import java.io.*;
import java.util.*;

public class Main {

    public static void main(String args[]) throws IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> pq4 = new PriorityQueue<>();
        int one = 0;
        int zero = 0;
        // pq1 -> 양수 / pq2 -> 1 / pq3 -> 0 / pq4 -> 음수
        
        for(int i = 0; i < n; i++)
        {
            int t = Integer.parseInt(br.readLine());
            
            if(t > 0 && t != 1)
                pq1.offer(t);
            else if(t == 1)
                one++;
            else if(t == 0)
                zero++;
            else 
                pq4.offer(t);
        }
        
        int sum = 0;
        
        // 양수 처리하기
        while(pq1.size() > 1)
        {
            int a = pq1.remove();
            int b = pq1.remove();
            
            sum += (a * b);
        }
        
        if(!pq1.isEmpty())
            sum += pq1.remove();
        
        // 음수 처리하기
        while(pq4.size() > 1)
        {
            int c = pq4.remove();
            int d = pq4.remove();
            
            sum += (c*d);
        }
        
        if(!pq4.isEmpty())
        {
            if(zero == 0)
            {
                sum += pq4.remove();
            }
        }
        
        // 1 처리하기
        sum += one;

        System.out.println(sum);
        }
    }