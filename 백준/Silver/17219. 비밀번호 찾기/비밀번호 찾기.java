import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> map = new HashMap<>();

        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine(); // 버퍼 비우기

        // N개의 주소 + 비밀번호 저장
        for (int i = 0; i < N; i++) {
            String line = sc.nextLine();
            String[] parts = line.split(" ");
            String address = parts[0];
            String password = parts[1];
            map.put(address, password);
        }

        // M개의 질의 처리
        for (int i = 0; i < M; i++) {
            String site = sc.nextLine();
            System.out.println(map.get(site));
        }
    }
}
