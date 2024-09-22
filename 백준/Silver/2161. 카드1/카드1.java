import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		//리스트 사용(배열이랑 선언 방식 같음)
		ArrayList <Integer> c = new ArrayList<>();
		
		//리스트에 1부터 차례로 값 넣음(초기화)
		for(int i = 1; i <= n; i++)
		{
			c.add(i);
		}
		
		//리스트 인덱스 변수
		int in = 0;
		
		while(c.size() > 1)
		{
			//첫번째 카드 출력(버릴거니까)&리스트 첫번째 지우기
			System.out.print(c.get(in) + " ");
			c.remove(in);
			
			//인덱스가 리스트 길이보다 작다는 것 확인
			//두 번째를 맨 뒤로 보내고 두 번째는 없애기
			if(in < c.size())
			{
				c.add(c.get(in));
				c.remove(in);
			}
			
			//인덱스가 리스트 크기 넘지 않게 조정
			if(in >= c.size())
				in = 0;
		}
		
		//마지막으로 남은 카드 출력
		System.out.print(c.get(in));
		
		//remove -> 리스트에서 지워지고 앞으로 당겨짐
	}
}