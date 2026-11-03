import java.util.*;
public class cf931A{
    static Scanner sc = new Scanner(System.in);
    public static void main(String [] args){
        double x1 = sc.nextInt();
        double x2 = sc.nextInt();
        int target = (int)Math.ceil((x1+x2)/2);
        int n1 = Math.abs(target-(int)x1);
        int n2 = Math.abs(target-(int)x2);
        int t1 = (n1*(n1+1))/2;
        int t2 = (n2*(n2+1))/2;
        System.out.println(t1+t2);
    }
}