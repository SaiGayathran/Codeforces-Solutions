import java.util.*;
public class cf734B{
    static Scanner sc = new Scanner(System.in);
    public static void main(String [] args){
        int k2 = sc.nextInt();
        int k3 = sc.nextInt();
        int k5 = sc.nextInt();
        int k6 = sc.nextInt();
        int n = Math.min(k2,Math.min(k5,k6));
        int sum=0;
        sum+=n*200+n*50+n*6;
        k2=k2-n;
        if(k2!=0){
            n = Math.min(k2,k3);
            sum += n*30+n*2;
        }
        System.out.println(sum);
    }
}