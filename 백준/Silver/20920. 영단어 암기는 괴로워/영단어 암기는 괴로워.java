import java.io.*;
import java.util.*;

public class Main {

    public static void main(String args[]) throws IOException {
        //Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> hm = new HashMap<>();

        for(int i = 0; i < n; i++)
        {
            String str = br.readLine();

            if(str.length() < m)
                continue;

            hm.put(str, hm.getOrDefault(str, 0)+1);
        }

        List<String> words = new ArrayList<>(hm.keySet());

        Collections.sort(words, (o1, o2) ->{
            int c1 = hm.get(o1);
            int c2 = hm.get(o2);

            if(c1 != c2)
                return c2 - c1;
            if(o1.length() != o2.length())
                return o2.length() - o1.length();

            return o1.compareTo(o2);
        });
        
        for(String str : words)
        {
            sb.append(str).append('\n');
        }
        System.out.println(sb);
        }
    }