
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int N,K,cnt =0;
        int[] A;

        Scanner sc =new  Scanner(System.in);

            N = sc.nextInt();
            K = sc.nextInt();

            A = new int[N];
            int index_m=N;

            for(int i=0; i<N ; i++) {
                A[i]=sc.nextInt();
            }

            for(int i = N-1 ; i>=0 ; i--) {
                if(A[i] <=K) {
                    cnt += K / A[i];   //선택한 동전으로 최대한 나누고
                 //   K = K - A[i] * cnt;
                    K %= A[i];         // 남은 금액은 다시 K원에 대입
                }
            }

            System.out.print(cnt);


    }

    }

