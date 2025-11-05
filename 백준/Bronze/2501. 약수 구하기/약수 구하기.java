import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String args[]) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int count = 0; // k번째 찾기 위한 변수
        
        for(int i = 1; i <= n; i++)
        {
            if(n%i == 0)
            {
                count += 1;  // 약수 찾으면
                
                if(count == k)  // k번째 약수 찾으면
                {
                    System.out.println(i);
                    return;
                }
            }
        }
        
        System.out.println(0);  // 'k번쨰 약수'를 못찾았을 때
}
}