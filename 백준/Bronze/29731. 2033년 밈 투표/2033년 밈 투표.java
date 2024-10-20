import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main {
	
	
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		
		String s1 = "Never gonna give you up";
		String s2 = "Never gonna let you down";
		String s3 = "Never gonna run around and desert you";
		String s4 = "Never gonna make you cry";
		String s5 = "Never gonna say goodbye";
		String s6 = "Never gonna tell a lie and hurt you";
		String s7 = "Never gonna stop";
		
		int n = sc.nextInt();
		int count = 0;
		sc.nextLine();
		
		String[] str = new String[n];
		
		for(int i = 0; i < n; i++)
		{
			str[i] = sc.nextLine();
		}
		
		for(int i = 0; i < n; i++)
		{
			if(str[i].equals(s1))
			{
				count += 0;
			}
			else if(str[i].equals(s2))
			{
				count += 0;
			}
			else if(str[i].equals(s3))
			{
				count += 0;
			}
			else if(str[i].equals(s4))
			{
				count += 0;
			}
			else if(str[i].equals(s5))
			{
				count += 0;
			}
			else if(str[i].equals(s6))
			{
				count += 0;
			}
			else if(str[i].equals(s7))
			{
				count += 0;
			}
			else
			{
				count += 1;
				break;
			}
		}
		
		if(count >= 1)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
