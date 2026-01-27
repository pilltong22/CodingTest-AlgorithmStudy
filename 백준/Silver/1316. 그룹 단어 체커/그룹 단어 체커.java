

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

public class Main {

    static boolean check(String str){
        for(int i=1; i<str.length(); i++) {
            for(int j=i-1; j>=0; j--) {
                if(str.charAt(i)==str.charAt(j)) {
                    if((j != (j - 1)) && (str.charAt(j+1) != str.charAt(j))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=parseInt(br.readLine());
        int cnt=0;

        for(int i=0;i<N;i++){
            String str=br.readLine();
            if(check(str)) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
