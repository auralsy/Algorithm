import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String Line = br.readLine();
        //-543
        StringTokenizer st = new StringTokenizer(Line);

        int a = Integer.parseInt(st.nextToken());

        bw.write((a-543) + "");

        bw.flush();
    }
}