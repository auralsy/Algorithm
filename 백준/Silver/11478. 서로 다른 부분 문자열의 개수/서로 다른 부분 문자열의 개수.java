import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringBuilder sb = new StringBuilder();

        String str = br.readLine();

        HashSet<String> hs = new HashSet<>();

        for(int i = 0; i < str.length(); i++)
        {
            for(int j = i+1; j < str.length()+1; j++)
            {
                hs.add(str.substring(i,j));
            }
        }

        System.out.println(hs.size());
    }
}