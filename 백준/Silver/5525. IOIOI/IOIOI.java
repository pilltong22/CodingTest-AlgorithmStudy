import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        String str = br.readLine();
        char[] S = str.toCharArray();
        int ans=0;
        int cnt=0;

        for(int i=0; i<M-2; i++) {
            if(S[i] =='I' && S[i+1] == 'O' && S[i+2] == 'I') {
                cnt++;
                if(cnt>=N) {
                    ans++;
                }
                i++;
            }
            else {
                cnt=0;
            }

        }

        System.out.println(ans);
    }
}
