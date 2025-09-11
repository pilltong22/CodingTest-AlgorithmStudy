

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int n1;
        int n2;
        int n12;
        int N;

        Scanner sc = new Scanner(System.in);
        n1=sc.nextInt();
        n2=sc.nextInt();
        n12=sc.nextInt();

        N =((n1+1)*(n2+1)/(n12+1)) - 1 ;

        System.out.println(N);
    }
}


