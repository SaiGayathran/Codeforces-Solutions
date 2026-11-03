import java.util.*;
public class cf1368A{
    static Scanner sc = new Scanner(System.in);
    public static void main(String [] args){
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            System.out.println(calc());
        }
    }
    static int calc(){
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        int c=0;
        while(a<=n && b<=n){
            if(a<=b){
                a+=b;
            }else{
                b+=a;
            }
            c++;
        }
        return c;
    }
}