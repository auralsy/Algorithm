import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        
        int[] origin = new int[n];
        int[] sorted = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for(int i = 0; i < n; i++) 
        {
            origin[i] = Integer.parseInt(st.nextToken());
            sorted[i] = origin[i];
        }
        
        Arrays.sort(sorted);
        
        HashMap<Integer, Integer> rankingMap = new HashMap<>();

        int rank = 0;
        
        for(int v : sorted) 
        {
            if(!rankingMap.containsKey(v)) 
            {
                rankingMap.put(v, rank);
                rank++;
            }
        }
        
        for(int key : origin) 
        {
            sb.append(rankingMap.get(key)).append(' ');
        }

        System.out.println(sb);
    }
}