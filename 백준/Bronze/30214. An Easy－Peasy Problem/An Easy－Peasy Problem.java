import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		double s1 = sc.nextInt();
		double s2 = sc.nextInt();
		
		if(s1 >= (s2/2))
			System.out.println("E");
		else
			System.out.println("H");
		
		sc.close();
	}
}
