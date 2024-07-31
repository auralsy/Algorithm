import java.util.Scanner;
public class Main
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        String sn = sc.next();
        char[] cn = sn.toCharArray();
        int sum = 0;
        
        for(int i = 0; i < cn.length; i++)
        {
            sum += cn[i] - '0';
        }
        System.out.print(sum);
    }
}