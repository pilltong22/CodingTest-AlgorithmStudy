

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        char []ch = str.toCharArray();

        boolean tagging=false;
        boolean wording=false;
        int lt =0;
        int rt =0;
        for(int i=0;i<ch.length;i++){
            if(ch[i] == '<') {

                rt=i-1;
                if(wording==true){

                    while(lt<rt){
                        char tmp;
                        tmp=ch[rt];
                        ch[rt]=ch[lt];
                        ch[lt]=tmp;
                        lt++;
                        rt--;
                    }
                }
                wording=false;
                tagging=true;
                lt = i;
            }
            else if(ch[i] == '>') {
                wording=false;
                tagging=false;
                lt = i + 1;

            }
            else if(ch[i]==' ') {
                wording=false;
                if(tagging==false) {
                    rt=i-1;

                    while(lt<rt){
                        char tmp;
                        tmp=ch[rt];
                        ch[rt]=ch[lt];
                        ch[lt]=tmp;
                        lt++;
                        rt--;
                    }
                    lt = i + 1;
                }
            }
            else {
                if(tagging==false && wording==false) {
                    lt=i;
                    wording=true;
                }
            }
        }

        if(tagging == false && wording == true) {
            rt=ch.length-1;
            while(lt<rt){
                char tmp;
                tmp=ch[rt];
                ch[rt]=ch[lt];
                ch[lt]=tmp;
                lt++;
                rt--;
            }
        }


        System.out.println(new String(ch));
    }
}
