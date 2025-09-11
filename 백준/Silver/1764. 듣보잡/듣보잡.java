
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {

        int N = 0;
        int M = 0;

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = null;

        st = new StringTokenizer(br.readLine()," ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        String a[] = new String[N];
        String b[] = new String[M];


        for(int i=0; i<N; i++) {
            a[i] = br.readLine();
        }
        for (int i=0; i<M;i++) {
            b[i] = br.readLine();
        }

    Arrays.sort(a);
    Arrays.sort(b);


        List<String> result = new ArrayList<>();
        int i=0;
        int j=0;
        while(i<N && j<M) {
                int cmp = a[i].compareTo(b[j]);

                if(cmp == 0) {
                    result.add(a[i]);
                    i++; j++;
                }
                else if(cmp<0) {
                    i++;
                }
                else {
                    j++;
                }
        }

        System.out.println(result.size());
        for(String name:result) {
            System.out.println(name);
        }

    }
}


