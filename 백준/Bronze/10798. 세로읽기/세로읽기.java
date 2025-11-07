import java.io.*;
import java.util.*;

public class Main {

    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);

        char[][] arr = new char[5][15];

        // 입력 파트
        for(int i = 0; i < 5; i++)
        {
            String str = sc.nextLine();

            for(int j = 0; j < str.length(); j++)
            {
                arr[i][j] = str.charAt(j);
            }
        }

        // 출력 파트
        StringBuilder sb = new StringBuilder();

        for(int j = 0; j < 15; j++)
        {
            for(int i = 0; i < 5; i++)
            {
                if(arr[i][j] != '\0')
                    sb.append(arr[i][j]);
            }
        }

        System.out.println(sb.toString());
    }
}