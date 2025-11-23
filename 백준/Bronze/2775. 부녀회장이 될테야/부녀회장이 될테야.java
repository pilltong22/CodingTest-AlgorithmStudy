import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int maxK = 14;
        int maxN = 14;
        
        int[][] dp = new int[maxK + 1][maxN + 1];
        
        for (int n = 1; n <= maxN; n++) {
            dp[0][n] = n;
        }
        
        for (int k = 1; k <= maxK; k++) {
            for (int n = 1; n <= maxN; n++) {
                dp[k][n] = dp[k - 1][n] + dp[k][n - 1];
            }
        }
        
        int T = Integer.parseInt(br.readLine());
        
        for (int t = 0; t < T; t++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            System.out.println(dp[k][n]);
        }
    }
}
