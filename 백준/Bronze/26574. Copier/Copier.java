import java.util.Scanner;
 
public class Main 
{
    public static void main(String args[]) 
    {
        
        Scanner sc = new Scanner(System.in);
        
        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            int n = sc.nextInt();
            System.out.println(n + " " + n);
        }
        
    }
}
