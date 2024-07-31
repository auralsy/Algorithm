import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		long f;
		String s;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		f = a*b*c;
		
		s = f + "";
		
		int n0 = 0, n1 = 0, n2 = 0, n3 = 0, 
				n4 = 0, n5 = 0, n6 = 0, n7 = 0, n8 = 0, n9 = 0;
		
		for(int i = 0; i<s.length(); i++)
		{
			if(s.charAt(i) == '0')
				n0 += 1;
			else if(s.charAt(i) == '1')
				n1 += 1;
			else if(s.charAt(i) == '2')
				n2 += 1;
			else if(s.charAt(i) == '3')
				n3 += 1;
			else if(s.charAt(i) == '4')
				n4 += 1;
			else if(s.charAt(i) == '5')
				n5 += 1;
			else if(s.charAt(i) == '6')
				n6 += 1;
			else if(s.charAt(i) == '7')
				n7 += 1;
			else if(s.charAt(i) == '8')
				n8 += 1;
			else if(s.charAt(i) == '9')
				n9 += 1;
		}
		
		System.out.println(n0);
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		System.out.println(n5);
		System.out.println(n6);
		System.out.println(n7);
		System.out.println(n8);
		System.out.println(n9);
	}
}