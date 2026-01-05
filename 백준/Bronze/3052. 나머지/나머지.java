import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringBuilder sb = new StringBuilder();

        HashSet<Integer> hs = new HashSet<>();

        for(int i = 0; i < 10; i++)
        {
            int n = Integer.parseInt(br.readLine());

            int r = n%42;

            hs.add(r);
        }

        System.out.println(hs.size());
        }
    }