import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[26]; //알파벳 갯수만큼의 길이 가진 배열
		
		//배열을 일단 -1로 초기화
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = -1;
		}
		
		String s = sc.nextLine(); //문자열 입력 받기
		
		for(int i = 0; i < s.length(); i++)
		{
			char ch = s.charAt(i);
			
			if(arr[ch - 'a'] == -1) //등장했는지 안했는지 여부
			{
				arr[ch - 'a'] = i; //조건 맞으면 해당 인덱스로 수정
			}
		}
		
		for(int i = 0; i < 26; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}
