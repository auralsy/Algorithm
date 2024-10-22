import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main {
	
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		
		String[] c_num = new String[n]; 
		
		for(int i = 0; i < n; i++)
		{
			c_num[i] = sc.nextLine();
		}
		
		for(int i = 0; i < n; i++)
		{
			switch(c_num[i])
			{
			case "Algorithm" :
			{
				System.out.println(204);
				break;
			}
			case "DataAnalysis" :
			{
				System.out.println(207);
				break;
			}
			case "ArtificialIntelligence":
			{
				System.out.println(302);
				break;
			}
			case "CyberSecurity":
			{
				System.out.println("B101");
				break;
			}
			case "Network":
			{
				System.out.println(303);
				break;
			}
			case "Startup":
			{
				System.out.println(501);
				break;
			}
			case "TestStrategy":
			{
				System.out.println(105);
				break;
			}
			}
		
		}
	}
}