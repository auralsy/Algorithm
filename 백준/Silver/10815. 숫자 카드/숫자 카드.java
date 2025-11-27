import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        //Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        HashSet<Integer> hs = new HashSet<>();

        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);

        for(int i = 0; i < n; i++)
        {
            hs.add(Integer.parseInt(st.nextToken()));
        }

        int h = Integer.parseInt(br.readLine());

        String str1 = br.readLine();
        StringTokenizer st1 = new StringTokenizer(str1);

        for(int i = 0; i < h; i++)
        {
            int t = Integer.parseInt(st1.nextToken());

            if(hs.contains(t))
            {
                sb.append("1 ");
            }
            else
                sb.append("0 ");
        }

        System.out.println(sb.toString());
    }
}