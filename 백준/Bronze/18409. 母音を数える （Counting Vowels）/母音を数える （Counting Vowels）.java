import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		sc.nextLine();
		String str = sc.nextLine();
		
		int fi = 0;
		
		for(int i = 0; i < a; i++)
		{
			if(str.charAt(i) == 'a')
				fi = fi + 1;
			else if(str.charAt(i) == 'i')
				fi = fi + 1;
			else if(str.charAt(i) == 'u')
				fi = fi + 1;
			else if(str.charAt(i) == 'e')
				fi = fi + 1;
			else if(str.charAt(i) == 'o')
				fi = fi + 1;
		}
		
		System.out.println(fi);
	}

}
