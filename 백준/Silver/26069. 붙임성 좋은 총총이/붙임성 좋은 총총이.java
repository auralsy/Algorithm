import java.io.*;
import java.util.*;

public class Main {

    public static void main(String args[]) throws IOException {
        //Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        HashSet<String> hs = new HashSet<>();

        hs.add("ChongChong");

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String personA = st.nextToken();
            String personB = st.nextToken();

            if(hs.contains(personA) || hs.contains(personB))
            {
                hs.add(personA);
                hs.add(personB);
            }
        }

        System.out.println(hs.size());
        }
    }