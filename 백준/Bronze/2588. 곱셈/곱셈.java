import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        bw.write(a*(b%10)+"");
        bw.newLine();
        bw.write(a*((b%100)/10)+"");
        bw.newLine();
        bw.write(a*(b/100)+"");
        bw.newLine();
        bw.write((a*(b%10)) + (a*((b%100)/10))*10 + (a*(b/100))*100 + "");

        bw.flush();
    }
}