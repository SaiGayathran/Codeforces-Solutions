import java.util.*;
public class cf1995A{
    static Scanner sc = new Scanner(System.in);
    static int n,k,d,count,f=1;
    public static void main(String [] args){
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            n=sc.nextInt();
            k=sc.nextInt();
            d=0;
            count=0;
            f=1;
            if(k==0){
                System.out.println(0);
            }else if(k<=n){
                System.out.println(1);
            }else{
                System.out.println(find());
            }
        }
    }
    static int find(){
        if(k>0){
            if(k>=n-d && n-d>=1 && f<2){
                ++count;
                k=k-n+d;
                f++;
                return find();
            }else{
                d++;
                f=0;
                return find();
            }
        }
        return count;
    }
}