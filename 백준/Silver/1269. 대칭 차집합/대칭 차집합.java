import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < a; i++)
            hs1.add(Integer.parseInt(st.nextToken()));

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < b; i++)
            hs2.add(Integer.parseInt(st.nextToken()));

        HashSet<Integer> hs3 = new HashSet<>(hs1);
        hs3.addAll(hs2);

        int count = 2*hs3.size() - (a+b);

        System.out.println(count);
    }
}