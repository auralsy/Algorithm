import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // 테스트 케이스 수

        for (int i = 0; i < t; i++) {
            int H = sc.nextInt(); // 층 수
            int W = sc.nextInt(); // 각 층의 방 수
            int N = sc.nextInt(); // 몇 번째 손님

            int floor = (N - 1) % H + 1; // 층 번호 계산
            int roomNumber = (N - 1) / H + 1; // 방 번호 계산

            System.out.printf("%d%02d\n", floor, roomNumber);
        }

        sc.close();
    }
}