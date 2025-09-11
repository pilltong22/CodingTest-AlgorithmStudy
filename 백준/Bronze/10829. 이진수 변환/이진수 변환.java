import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine().trim()); // 1 ≤ N ≤ 1e14

        int[] bits = new int[64]; // long 이진 자리수(최대 64)면 충분
        int i = 0;

        while (N > 0) {
            bits[i++] = (int)(N & 1L); // N % 2
            N >>= 1;                   // N /= 2
        }

        StringBuilder sb = new StringBuilder(i);
        for (int j = i - 1; j >= 0; j--) sb.append(bits[j]);
        System.out.println(sb);
    }
}