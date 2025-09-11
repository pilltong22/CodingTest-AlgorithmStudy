
import java.util.*;
public class Main {
    public static void main(String[] args) {


        int N;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        int result =0;

        int a =0; //5킬로 봉지 개수
        int b =0; //3킬로 봉지 개수



           if( (N % 5) % 3 == 0) {  //나눠질때
               //System.out.println("in 나눠");
               a= N/5;
               b= (N%5)/3 ;
               System.out.println(a+b);
               return;
           }
           else {  //안나눠질때
               for(int i=1 ; 3*i <= N ;i++)
               {
                  // System.out.println("in 안나눠");
                  // System.out.println("값:" + (N-3*i)%5);
                   if((N-3*i)%5 ==0)
                   {
                       //System.out.println("이프문들");
                       b=i;
                       a= (int)((N-3*b)/5);
                       System.out.println(a+b);
                       return;
                   }
               }
           }

        System.out.println("-1");

      //  System.out.println(a+b);

    }
}
