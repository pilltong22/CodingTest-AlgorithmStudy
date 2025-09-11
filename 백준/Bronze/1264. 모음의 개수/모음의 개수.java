import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String s = "";
        int cnt=0;

        Scanner sc=new Scanner(System.in);


        while(!s.equals("#")) {
            cnt=0;
            s=sc.nextLine();
            for(int i=0; i<s.length(); i++) {
                if(s.charAt(i)=='#')
                    break;
                else if(s.charAt(i)=='a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'
                || s.charAt(i)=='A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U'){
                  cnt++;
                }
            }
            if(s.charAt(0)!='#')
                System.out.println(cnt);

        }

    }



    }


