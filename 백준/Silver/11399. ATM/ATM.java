import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;

        int N = Integer.parseInt(br.readLine());
        int[] P = new int[N];

        st= new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            P[i]= Integer.parseInt(st.nextToken());
        }

        Arrays.sort(P);

        int sum =0;

        for(int i=1;i<=N-1;i++){
            P[i] = P[i]+P[i-1];
        }

        for(int i=0;i<N;i++){
            sum+=P[i];
        }

        System.out.println(sum);
    }
}
