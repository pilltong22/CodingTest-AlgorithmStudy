//

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        
        int N=0;
        ArrayList <Integer> list = new ArrayList <>();

        Scanner sc = new Scanner(System.in);

        N=sc.nextInt();

        while(true) {

            list.add(N%10);
            N=N/10;
            if(N<1) break;
        }

        Collections.sort(list, Collections.reverseOrder());


        for(int n:list) {
            System.out.print(n);
        }

    }
}



