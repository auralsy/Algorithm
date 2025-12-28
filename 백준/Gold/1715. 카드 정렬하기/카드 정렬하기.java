import java.io.*;
import java.util.*;

public class Main {

    public static void main(String args[]) throws IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i = 0; i < n; i++)
        {
            int temp = Integer.parseInt(br.readLine());

            pq.add(temp);
        }

        int d1 = 0;
        int d2 = 0;
        int sum = 0;
        
        while(pq.size() != 1)
        {
            d1 = pq.remove();
            d2 = pq.remove();
            
            sum += (d1 + d2);
            pq.add(d1 + d2);
        }
        
        System.out.println(sum);
        }
    }