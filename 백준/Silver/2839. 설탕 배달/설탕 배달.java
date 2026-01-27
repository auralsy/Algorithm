import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int count = 0; 

        while (true) {
            if (n % 5 == 0) {
                System.out.println(n / 5 + count);
                return;
            }
            else if (n < 0) {
                System.out.println(-1);
                return;
            }
            
            n -= 3;
            count++;
        }
    }
}