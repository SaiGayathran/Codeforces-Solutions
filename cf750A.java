import java.util.*;
public class cf750A{
    static Scanner sc = new Scanner(System.in);
    public static void main(String [] args){
        int n = sc.nextInt();
        int k = sc.nextInt();
        int time,s=0;
        time =240-k;
        s=time/5;
        int q;
        q=(int)(Math.sqrt(1+8*s)-1)/2;
        if(q<n){
            System.out.println(q);
        }else{
            System.out.println(n);
        }
    }
}