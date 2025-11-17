
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N,K;
        int[] arr;
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        arr = new int[N];
        int[] prefix = new int[N+1];
        st = new StringTokenizer(br.readLine());

        for(int i=0; i<N; i++) {
            arr[i]= Integer.parseInt(st.nextToken());
        }

        for(int i =0; i<N; i++) {
            prefix[i+1]= prefix[i] + arr[i];
        }

        int result=0;
        int sum=-101;

        for(int i=K; i<=N; i++) {
            sum = prefix[i] - prefix[i-K];
            if(i == K)
                result=sum;
            if(sum>result) {
                result=sum;
            }
        }

        System.out.println(result);

    }
}
