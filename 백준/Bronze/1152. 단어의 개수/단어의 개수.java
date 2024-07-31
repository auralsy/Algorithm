import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		int c = 0;
		
		for(int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) == ' ')
			{
				c++;
			}
		}
		if(s.isEmpty()) {
			System.out.println(0);
		}
		if(s.charAt(0) != ' ' && s.charAt(s.length()-1) != ' ') {
			c = c + 1;
		}
		if(s.charAt(0) == ' ' && s.charAt(s.length()-1) == ' ') {
			c = c - 1;
		}
		System.out.println(c);
	}
}