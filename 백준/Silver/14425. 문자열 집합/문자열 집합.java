import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        StringTokenizer st = new StringTokenizer(str1);

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int count = 0;

        HashSet<String> hs1 = new HashSet<String>();

        for(int i = 0; i < n; i++)
        {
            hs1.add(br.readLine());
        }

        for(int i = 0; i < m; i++)
        {
            String str = br.readLine();
            
            if(hs1.contains(str))
                count++;
        }

        System.out.println(count);
    }
}