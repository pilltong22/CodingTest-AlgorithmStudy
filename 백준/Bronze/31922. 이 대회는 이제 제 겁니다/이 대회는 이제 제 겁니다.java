
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int max =0;
        int A =0;
        int P =0;
        int C =0;

        Scanner sc = new Scanner(System.in);

        A=sc.nextInt();
        P=sc.nextInt();
        C=sc.nextInt();

        if(A+C>=P) max=A+C;
        else max=P;

        System.out.println(max);


    }
}
