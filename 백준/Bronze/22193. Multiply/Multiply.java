import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main {
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //숫자랑 연산 커지니까 BufferedReader로
		String hoo_ha = bf.readLine(); //첫 줄은 그냥 문자열 자체로 입력 받아
		//BufferedReader로 입력받으면 문자열로 취급되는데 new BigInteger(String) 생성자가 입력받은 문자열을 BigInteger로 변환
		BigInteger a = new BigInteger(bf.readLine());
		BigInteger b = new BigInteger(bf.readLine());
		
		System.out.println(a.multiply(b)); //곱셈 수행
		//multiply 메서드
		// -> BigInteger의 메서드
		// -> BigInteger 객체를 곱하여 새로운 BigInteger 객체를 반환
	}
}