import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		//2차원 배열 생성
		String[][] arr = new String[n][2];
		
		//나이, 이름 입력받아 저장
		for(int i = 0; i < n; i++)
		{
			arr[i][0] = sc.next();
			arr[i][1] = sc.next();
		}
		
		//정렬
		Arrays.sort(arr, new Comparator<String[]>()
        {
            @Override
            public int compare(String[] s1, String[] s2)
            {
                int age1 = Integer.parseInt(s1[0]);
                int age2 = Integer.parseInt(s2[0]);
                return age1 - age2;
            }
        });
		
		for(int i = 0; i < n; i++)
		{
			System.out.println(arr[i][0] + " " + arr[i][1]);
		}
	}
	
}