import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		//테스트 케이스 입력받기
		int n = sc.nextInt();
		sc.nextLine();
		
		//1차원 배열
		String[] arr = new String[n];
		
		//퀴즈 정답여부 입력받기(테스트 케이스 만큼/배열 각 요소에 문자열 저장)
		for(int i = 0; i < n; i++)
		{
			arr[i] = sc.nextLine();
		}
		
		//점수 계산 로직
		for(int j = 0; j < n; j++)
		{
			int k = 0;
			int grade = 0; //k와 grade를 0으로 초기화
			
			for(int i = 0; i < arr[j].length(); i++)
			{
				if(arr[j].charAt(i) == 'O')
				{
					grade++;
					k += grade;
				}
				else
					grade = 0;
			}
			System.out.println(k);
		}
			}
		}