import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<Integer>[] A;
    static boolean arrive;
    static boolean visited[];
    public static void main(String args[]) throws IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        arrive = false;
        
        A = new ArrayList[n];
        visited = new boolean[n];
        
        for(int i = 0; i < n; i++)
        {
            A[i] = new ArrayList<Integer>();
        }

        for(int i = 0; i < m; i++)
        {
            st = new StringTokenizer(br.readLine());
            
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            
            A[s].add(e);
            A[e].add(s);
        }
        
        for(int i = 0; i < n; i++)
        {
            DFS(i,1);
            
            if(arrive)
                break;
        }
        
        if(arrive)
            System.out.println("1");
        else
            System.out.println("0");
    }
    
    public static void DFS(int now, int depth)
    {
        if(depth == 5 || arrive)
        {
            arrive = true;
            return;
        }
        visited[now] = true;
        
        for(int i : A[now])
        {
            if(!visited[i])
            {
                DFS(i, depth+1);
            }
        }
        visited[now] = false;
    }
}