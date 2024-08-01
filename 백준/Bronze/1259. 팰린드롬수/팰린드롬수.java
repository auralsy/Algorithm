import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			int a = sc.nextInt();
			
			if(a == 0)
				break;
			else if(a < 10)
				System.out.println("yes");
			else if(10 <= a && a <100 && ((a/10) == (a % 10)))
				System.out.println("yes");
			else if(100 <= a && a < 1000 && ((a/100) == (a % 10)))
				System.out.println("yes");
			else if(1000 <= a && a < 10000 && (a/1000 == a % 10) && ((a%1000-a%100)/100 == (a%100 - a %10)/10))
				System.out.println("yes");
			else if(10000 <= a && a <= 99999 && (a/10000 == a %10) && ((a%10000-a%1000)/1000 == (a%100-a%10)/10))
				System.out.println("yes");
			else
				System.out.println("no");
					
		}
		sc.close();
	}
}
