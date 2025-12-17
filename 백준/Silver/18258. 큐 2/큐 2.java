import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        //Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Deque<Integer> que = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++)
        {
            String str = br.readLine();

            if(str.contains("push"))
            {
                StringTokenizer st = new StringTokenizer(str);
                st.nextToken();
                que.add(Integer.parseInt(st.nextToken()));
            }
            else if(str.contains("pop"))
            {
                if(que.isEmpty())
                {
                    sb.append(-1).append('\n');
                }
                else
                {
                    sb.append(que.peek()).append('\n');
                    que.remove(que.peek());
                }
            }
            else if(str.contains("size"))
            {
                sb.append(que.size()).append('\n');
            }
            else if(str.contains("empty"))
            {
                if(que.isEmpty())
                    sb.append(1).append('\n');
                else
                    sb.append(0).append('\n');
            }
            else if(str.contains("front"))
            {
                if(que.isEmpty())
                {
                    sb.append(-1).append('\n');
                }
                else
                {
                    sb.append(que.peek()).append('\n');
                }
            }
            else if(str.contains("back"))
            {
                if(que.isEmpty())
                {
                    sb.append(-1).append('\n');
                }
                else
                {
                    sb.append(que.peekLast()).append('\n');
                }
            }
        }

        System.out.println(sb);
        }
    }