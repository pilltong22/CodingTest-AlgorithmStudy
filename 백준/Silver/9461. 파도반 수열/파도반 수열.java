import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T , N, result;

        T = Integer.parseInt(br.readLine());

        for(int i=0 ; i<T ; i++) {
            N= Integer.parseInt(br.readLine());
            System.out.println(met(N));

        }

    }

    public static long met(int N) {
        long[] d = new long[N+1];
        
        if(N<=3) return 1;
        
        d[1] =1;
        d[2] =1;
        d[3] =1;

        for(int i = 4; i<=N ; i++) {
            d[i] = d[i-2] + d[i-3];
        }

        return d[N];
    }
}