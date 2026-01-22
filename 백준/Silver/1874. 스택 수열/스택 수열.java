import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < n; i++)
        {
            a[i] = Integer.parseInt(br.readLine());
        }

        StringBuffer bf = new StringBuffer();
        int num = 1;
        boolean result = true;
        for(int i = 0; i < a.length; i++)
        {
            int su = a[i];

            if(su >= num)
            {
                while(su >= num)
                {
                    stack.push(num++);
                    bf.append("+\n");
                }
                stack.pop();
                bf.append("-\n");
            }
            else
            {
                int ni = stack.pop();

                if(ni > su)
                {
                    System.out.println("NO");
                    result = false;
                    break;
                }
                else
                {
                    bf.append("-\n");
                }
            }
        }
        if(result)
            System.out.println(bf.toString());
    }
    }