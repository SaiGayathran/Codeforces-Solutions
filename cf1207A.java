import java.util.*;
public class cf1207A{
    static int b,p,f,h,c,profit=0;
    static Scanner sc = new Scanner(System.in);
    public static void main(String [] args){
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            profit=0;
            b=sc.nextInt();
            p=sc.nextInt();
            f=sc.nextInt();
            h=sc.nextInt();
            c=sc.nextInt();
            if((p+f)<=b/2){
                profit=p*h+f*c;
                System.out.println(profit);
            }else{
                System.out.println(calc());
            }
        }
    }
    static int calc(){
           if(h>=c){
                profit=(Math.min(p,b/2)*h);
                b-=2*Math.min(p,b/2);
                if(b>1){
                    profit+=Math.min(f,b/2)*c;
                }
            }else{
                profit=(Math.min(f,b/2)*c);
                b-=2*Math.min(f,b/2);
                if(b>1){
                    profit+=Math.min(p,b/2)*h;
                }
            }
        return profit;
    }
}