import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        //Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true)
        {
            String str = br.readLine();
            if(str.equals("."))
                break;

            Stack<Character> stack = new Stack<>();
            boolean balanced = true;

            for(int i = 0; i < str.length(); i++)
            {
                if(str.charAt(i) == '[' || str.charAt(i) == '(')
                {
                    stack.push(str.charAt(i));
                }
                else if(str.charAt(i) == ')')
                {
                    if(stack.isEmpty() || stack.peek() != '(')
                    {
                        balanced = false;
                        break;
                    }

                    stack.pop();
                }
                else if(str.charAt(i) ==']')
                {
                    if(stack.isEmpty() || stack.peek() != '[')
                    {
                        balanced = false;
                        break;
                    }
                    stack.pop();
                }
            }
            if(balanced && stack.isEmpty())
            {
                sb.append("yes").append('\n');
            }
            else
                sb.append("no").append('\n');
        }

        System.out.println(sb);

        }
    }