
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

       int N = Integer.parseInt(br.readLine());

       int[] A = new int[N];

       for(int i=0;i<N;i++) {
           A[i] = N-i-1;
       }

       boolean yn= false;

        for (int i = N - 1; i > 0; i--) {
            for (int j = i - 1; j >= 0; j--) {

                if(A[j] > A[i]) {
                    if(j<= i-2) {
                        yn = true;
                        break;
                    }
                }

            }
            if(yn == true)
                break;
        }

        for(int i=0;i<N;i++) {
            System.out.print(A[i]+" ");
        }

        }

    }


