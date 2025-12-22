import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        //Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        Deque<Integer> dq = new ArrayDeque<>();

        for(int i = 0; i < n; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String c = st.nextToken();

            if(c.equals("1"))
                dq.offerFirst(Integer.parseInt(st.nextToken()));
            else if(c.equals("2"))
                dq.offerLast(Integer.parseInt(st.nextToken()));
            else if(c.equals("3"))
            {
                if(dq.isEmpty())
                    sb.append(-1).append('\n');
                else
                {
                    sb.append(dq.peekFirst()).append('\n');
                    dq.pollFirst();
                }

            }
            else if(c.equals("4"))
            {
                if(dq.isEmpty())
                    sb.append(-1).append('\n');
                else
                {
                    sb.append(dq.peekLast()).append('\n');
                    dq.pollLast();
                }
            }
            else if(c.equals("5"))
            {
                sb.append(dq.size()).append('\n');
            }
            else if(c.equals("6"))
            {
                if(dq.isEmpty())
                    sb.append(1).append('\n');
                else
                    sb.append(0).append('\n');
            }
            else if(c.equals("7"))
            {
                if(dq.isEmpty())
                    sb.append(-1).append('\n');
                else
                    sb.append(dq.peekFirst()).append('\n');
            }
            else
            {
                if(dq.isEmpty())
                    sb.append(-1).append('\n');
                else
                    sb.append(dq.peekLast()).append('\n');
            }
        }
        System.out.println(sb);
        }
    }