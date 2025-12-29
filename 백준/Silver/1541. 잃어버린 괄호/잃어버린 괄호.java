import java.io.*;
import java.util.*;

public class Main {

    public static void main(String args[]) throws IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine(), "-");

        int sum = 0;
        boolean isFirst = true;

        while(st.hasMoreTokens())
        {
            int tempSum = 0;

            StringTokenizer st2 = new StringTokenizer(st.nextToken(), "+");

            while(st2.hasMoreTokens())
            {
                tempSum += Integer.parseInt(st2.nextToken());
            }

            if(isFirst)
            {
                sum = tempSum;
                isFirst = false;
            }
            else
            {
                sum -= tempSum;
            }
        }
        System.out.println(sum);
        }
    }