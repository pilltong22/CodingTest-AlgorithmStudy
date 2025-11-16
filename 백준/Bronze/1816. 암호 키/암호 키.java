import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        Long N;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Long.parseLong(br.readLine());
        for(Long i=0L; i<N;i++) {
            Long check = Long.parseLong(br.readLine());
            for(Long j=2L; j<= 1000000; j++) {
                if(check%j ==0) {
                    System.out.println("NO");
                    break;
                }
                if( j==1000000 ) {
                    System.out.println("YES");
                }
            }
        }
    }
}
