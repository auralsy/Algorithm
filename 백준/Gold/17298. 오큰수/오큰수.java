import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>(); // 스택에는 인덱스를 저장
        int[] a = new int[n]; // 수열 저장하는 배열
        int[] answer = new int[n]; // 결과 저장하는 배열
        String[] str = br.readLine().split(" ");

        for(int i = 0; i < n; i++)
        {
            a[i] = Integer.parseInt(str[i]);
        }

        stack.push(0);

        for(int i = 1; i < n; i++)
        {
            while(!stack.isEmpty() && a[stack.peek()] < a[i])
            {
                answer[stack.pop()] = a[i];
            }
            stack.push(i);
        }
        while(!stack.empty())
        {
            answer[stack.pop()] = -1;
        }

        for(int i = 0; i < n; i++)
        {
            sb.append(answer[i] + " ");
        }

        System.out.println(sb.toString());
    }
    }