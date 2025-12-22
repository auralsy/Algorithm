import java.io.*;
import java.util.*;

public class Main {

    public static void main(String args[]) throws IOException {
        //Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Deque<Integer> dq = new ArrayDeque<>();

        int n = Integer.parseInt(br.readLine());
        
        int[] dstype = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++)
        {
            dstype[i] = Integer.parseInt(st.nextToken());
        }
        
        st = new StringTokenizer(br.readLine());
        
        for(int i = 0; i < n; i++)
        {
            int v = Integer.parseInt(st.nextToken());
            
            if(dstype[i] ==0)
                dq.addLast(v);
        }
        
        int m = Integer.parseInt(br.readLine());
        
        st = new StringTokenizer(br.readLine());
        
        for(int i = 0; i < m; i++)
        {
            int newN = Integer.parseInt(st.nextToken());
            
            dq.addFirst(newN);
            
            sb.append(dq.pollLast()).append(" ");
        }

        System.out.println(sb);
        }
    }