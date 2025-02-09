import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double n = Integer.parseInt(br.readLine());

        System.out.printf("%.10f\n%.10f", 100/n, 100/(100-n));
    }
}