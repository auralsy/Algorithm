import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        //Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int order = 1;
        Stack<Integer> stack = new Stack<>();
        
        StringTokenizer st = new StringTokenizer(br.readLine());
       
        for(int i = 0; i < n; i++)
        {
            int current = Integer.parseInt(st.nextToken());
            
            if(current == order)
            {
                order++;
            }
            else
            {
                stack.push(current);
            }
            
            while(!stack.isEmpty() && stack.peek() == order)
            {
                stack.pop();
                order++;
            }
        }
        
        if(stack.isEmpty())
            System.out.println("Nice");
        else System.out.println("Sad");
        }
    }