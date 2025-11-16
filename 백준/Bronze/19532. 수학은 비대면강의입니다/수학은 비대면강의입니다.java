import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        int a,b,c,d,e,f;
        int x,y;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken());
        e = Integer.parseInt(st.nextToken());
        f = Integer.parseInt(st.nextToken());
        
        for(x=-999; x<=999; x++) {
            for(y = -999; y<= 999; y++) {
                if(a*x + b*y ==c && d*x + e*y == f){
                    System.out.println(x+" "+y);
                    break;
                }
            }
        }


    }
}
