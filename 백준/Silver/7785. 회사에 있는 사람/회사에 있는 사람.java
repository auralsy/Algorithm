import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        StringTokenizer st = new StringTokenizer(str1);
        int n = Integer.parseInt(st.nextToken());
        
        HashSet<String> hs = new HashSet<>();

        for(int i = 0; i < n; i++)
        {
            String str = br.readLine();

            StringTokenizer st1 = new StringTokenizer(str);
            String name = st1.nextToken();
            String enl = st1.nextToken();

            if(enl.equals("enter"))
                hs.add(name);

            if(enl.equals("leave") && hs.contains(name))
                hs.remove(name);
        }

        ArrayList<String> list = new ArrayList<>(hs);
        Collections.sort(list, Collections.reverseOrder());

        for(String s : list)
            System.out.println(s);
    }
}