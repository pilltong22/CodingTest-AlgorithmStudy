import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N =Integer.parseInt(br.readLine());
            int A,B,C;
            int cnt = 0;

            for(A=2; A < N;A=A+2) {
                for(B=1 ; B<N-A; B++) {
                    for(C=B+2; C<=N-A-B ;C++) {
                        if(A+B+C == N)
                            cnt++;
                    }
                }
            }

            System.out.println(cnt);
        }
}
