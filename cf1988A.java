import java.util.*;
public class cf1988A{
    static Scanner sc = new Scanner(System.in);
    static int n,k;
    public static void main(String [] args){
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            n=sc.nextInt();
            k=sc.nextInt();
            System.out.println((int)Math.ceil((double)(n-1)/(double)(k-1)));
        }
    }
}