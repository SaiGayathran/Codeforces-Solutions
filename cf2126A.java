import java.util.*;
public class cf2126A{
    static Scanner sc = new Scanner(System.in);
    public static void main(String [] args){
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            System.out.println(find(n));
        }
    }
    static int find(int n){
        int min=Integer.MAX_VALUE;
        while(n>0){
            int x = n%10;
            n=n/10;
            if(min>=x){
                min=x;
            }
        }
        return min;
    }
}