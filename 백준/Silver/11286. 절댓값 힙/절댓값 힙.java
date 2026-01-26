import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        
        PriorityQueue<Integer> que = new PriorityQueue<>((o1, o2) -> {
            int fabs = Math.abs(o1);
            int sabs = Math.abs(o2);
            
            if(fabs == sabs)
                return o1 > o2 ? 1 : -1;
            else 
                return fabs - sabs;
        });

        for(int i = 0; i < n; i++)
        {
            int request = Integer.parseInt(br.readLine());
            if(request == 0)
            {
                if(que.isEmpty())
                    System.out.println("0");
                else
                    System.out.println(que.poll());
            }
            else 
                que.add(request);
        }
    }
    }