import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main {
	
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		
		int[] str = new int[4];
		
		for(int i = 0; i < 4; i++)
		{
			str[i] = sc.nextInt();
		}
		
		int max = str[0];
		
		if(max < str[1])
			max = str[1];
		
		if(max < str[2])
			max = str[2];
		
		if(max < str[3])
			max = str[3];
		
		int min = str[0];
		
		if(min > str[1])
			min = str[1];
		
		if(min > str[2])
			min = str[2];
		
		if(min > str[3])
			min = str[3];
		
		int max_sum = max + min;
		
		int all_sum = str[0] + str[1] + str[2] + str[3];
		
		int min_sum = all_sum - max_sum;
		
		if(max_sum > min_sum)
			System.out.println(max_sum - min_sum);
		else
			System.out.println(min_sum - max_sum);
	}
}