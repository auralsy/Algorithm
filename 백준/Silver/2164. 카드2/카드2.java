import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Queue<Integer> que = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());

        for(int i = 1; i <= n; i++)
        {
            que.add(i);
        }

        while(que.size() != 1)
        {
            que.poll();
            que.add(que.poll());
        }

        System.out.println(que.peek());
    }
    }