import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 피보나치 수열을 담을 리스트
        List<Long> l = new ArrayList<>();
        l.add(1L); // F(1)
        l.add(1L); // F(2)

        // N+1번째 항까지 채우기
        for (int i = 2; i <= N; i++) { // i=2부터 N까지
            l.add(l.get(i-2) + l.get(i-1));
        }

        // 둘레 계산: 2 * (F(N) + F(N+1))
        long result = 2 * (l.get(N-1) + l.get(N));
        System.out.println(result);
    }
}
