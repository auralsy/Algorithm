import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int fuck = sc.nextInt();
		int you = sc.nextInt();
		
		if(fuck > you)
			System.out.println(1);
		else if(fuck == you)
			System.out.println(0);
		else
			System.out.println(-1);
	}

}
