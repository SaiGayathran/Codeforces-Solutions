import java.util.*;
public class cf1623A{
    static Scanner sc = new Scanner(System.in);
    static int n,m,r,c,dr,dc,ir,ic,s;
    public static void main(String [] args){
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            n=sc.nextInt();
            m=sc.nextInt();
            r=sc.nextInt();
            c=sc.nextInt();
            dr=sc.nextInt();
            dc=sc.nextInt();
            s=0;
            ir=1;
            ic=1;
            System.out.println(time());
        }
    }
    static int time(){
        if(r==dr || c==dc){
            return s;
        }
        else{
            if(n-r>=1 && m-c>=1){
                r+=ir;
                c+=ic;
            }else{
                if(n-r<1 && m-c>=1){
                    ir*=(-1);
                    r+=ir;
                    c+=ic;
                }else if(n-r>=1 && m-c<1){
                    ic*=-1;
                    r+=ir;
                    c+=ic;
                }else{
                    ic*=-1;
                    ir*=-1;
                    r+=ir;
                    c+=ic;
                }
            }
        }
        s++;
        return time();
    }
}