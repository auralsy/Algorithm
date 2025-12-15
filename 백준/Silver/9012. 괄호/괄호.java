import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        //Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++)
        {
            String str = br.readLine();
            boolean isVPS = true;
            int count = 0;

            for(int j = 0; j < str.length(); j++)
            {
                if(str.charAt(j) == '(')
                    count++;
                else 
                    count--;
                
                if(count < 0)
                {
                    isVPS = false;
                    break;
                }
            }
            
            if(count == 0 && isVPS)
                sb.append("YES").append('\n');
            else 
                sb.append("NO").append('\n');
        }
        
        System.out.println(sb);
        }
    }