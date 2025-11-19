import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.TreeSet;


public class Main {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        TreeSet <Integer> tr = new TreeSet<>();

        for(int i=0; i<N; i++) {
            tr.add(Integer.parseInt(br.readLine()));
        }


        StringBuilder sb = new StringBuilder();

        for(int n: tr) {
            sb.append(n).append('\n');
        }

        System.out.print(sb.toString());
        
    }
}
