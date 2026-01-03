import java.io.*;
import java.util.*;

public class Main {

    static int N;

    public static void main(String args[]) throws IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());

        DFS(2, 1);
        DFS(3, 1);
        DFS(5, 1);
        DFS(7, 1);
    }

    // DFS 메서드
    static void DFS(int n, int sca) {
        if (sca == N) {
            if (isPrime(n)) {
                System.out.println(n);
            }
            return;
        }

        for (int i = 1; i < 10; i++) {
            if (i % 2 == 0)
                continue;

            if (isPrime(n * 10 + i))
                DFS(n * 10 + i, sca + 1);
        }
    }

    // 소수 판별 메서드
    static boolean isPrime(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}