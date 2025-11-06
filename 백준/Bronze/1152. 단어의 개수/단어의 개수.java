import java.io.*;
import java.util.*;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str);

        int sum = 0;

        while(st.hasMoreTokens())
        {
            st.nextToken();
            sum += 1;
        }

        System.out.println(sum);
    }
}