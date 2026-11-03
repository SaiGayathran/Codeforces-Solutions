import java.util.*;
public class cf546A {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();
        int total;
        total = k*(w*(w+1))/2;
        int borrow;
        borrow = total-n;
        if(total<n){
            System.out.println(0);
        }else{
            System.out.println(borrow);
        }
        sc.close();
    }        
}