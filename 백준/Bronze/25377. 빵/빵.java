import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException
	{	
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		   int N = Integer.parseInt(br.readLine());
		        int bread = 1001;
		        boolean flag = true;
		        for (int i = 0; i < N; i++) {
		            StringTokenizer st = new StringTokenizer(br.readLine());

		            int A = Integer.parseInt(st.nextToken());
		            int B = Integer.parseInt(st.nextToken());

		            if (A < B || A==B) 
		            {
		                flag = false;
		              bread = Math.min(bread,B);
		            } 
		        }
		        
		        if(flag) 
		        {
		            System.out.println(-1);
		        } 
		        else 
		        {
		            System.out.println(bread);
		        }
		    }
}