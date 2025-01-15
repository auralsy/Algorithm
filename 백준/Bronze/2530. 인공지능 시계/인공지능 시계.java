import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(br.readLine());
        
        c += d;  
        b += (c/60);
        c = c % 60;
        a += (b/60);
        b = b % 60;
        a = a % 24;
        
        System.out.print(a + " " + b + " " + c);
    }
}