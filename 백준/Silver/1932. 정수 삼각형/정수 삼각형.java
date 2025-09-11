
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main (String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt;
        int result=0;
        int n;
            n = Integer.parseInt(br.readLine());

        int[][] p = new int[n+1][n+1];
        int[][] dp =new int[n+1][n+1];

        StringTokenizer st =null;

        for(int i = 1 ;i<n+1; i++) {
                st = new StringTokenizer(br.readLine(), " ");
            for(int j =1 ; j<=i; j++) {
                p[i][j] = Integer.parseInt(st.nextToken());
            }
        }


        for(int i=1; i<n+1 ;i++) {
            for(int j =1 ; j<n+1;j++) {

                // i행 j열 위치의 모든 값이 좌상단 및 우상단을 가짐(feat. n+1)
                // 좌상단과 우상단 중 큰 값과 현재 위치의 숫자를 더해서 현재 위치의 최적의 값을 dp 배열에 누적
                dp[i][j] = Math.max(dp[i-1][j-1] , dp[i-1][j]) + p[i][j]; //좌상단 우상단중 큰거 중 선택후 나랑 더함.
            }
        }



        for(int i =1 ; i<n+1; i++) {
            result=Math.max(result,dp[n][i]);
        }

        System.out.print(result);

    }
}
