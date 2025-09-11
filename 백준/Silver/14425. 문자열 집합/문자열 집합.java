
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int N,M;
        N = sc.nextInt();
        M = sc.nextInt();
        HashMap<String, String> h1 = new HashMap<String, String>( );
        HashSet<String> set = new HashSet<>();
        int cnt=0;

        String st_N;
        String st_M;

        sc.nextLine();

        for(int i=0; i<N ;i++) {
            st_N=sc.nextLine();
            set.add(st_N);
        }

//        for(int i=0; i<N ;i++) {
//            System.out.println(set);
//        }
       // sc.nextLine();

        for(int i=0; i<M;i++) {
            st_M = sc.nextLine();
            if(set.contains(st_M)==true) {
                cnt++;
            }
        }
        System.out.println(cnt);

    }
}


