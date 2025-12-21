import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        //Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int resultCount = 0;

        for(int i = 0; i < n; i++)
        {
            int oCount = 0;
            int xCount = 0;

            String str = br.readLine();

            for(int j = 0; j < m; j++)
            {
                if(str.charAt(j) == 'O')
                    oCount++;
                else
                    xCount++;
            }

            if(oCount > xCount)
                resultCount++;
        }

        System.out.println(resultCount);
        }
    }