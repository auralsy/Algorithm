import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		int k = scanner.nextInt();
		int f = scanner.nextInt();
		
		//배열 생성
		int[][] arr = new int[k][f];
		int[][] arr1 = new int[k][f];
		
		//arr 배열에 입력받기
		for(int i = 0; i < k; i++)
		{
			for(int j = 0; j < f; j++)
			{
				arr[i][j] = scanner.nextInt();
			}
		}
		
		//arr_1 배열에 입력받기
		for(int i = 0; i < k; i++)
		{
			for(int j = 0; j < f; j++)
			{
				arr1[i][j] = scanner.nextInt();
			}
		}
		
		//
		for(int i = 0; i < k; i++)
		{
			for(int j = 0; j < f; j++)
			{
				System.out.print(arr[i][j] + arr1[i][j]+ " ");
				if(j == f-1)
					System.out.println();
			}
		}
	}
}