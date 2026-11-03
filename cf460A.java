import java.util.*;
public class cf460A{
    static Scanner sc = new Scanner(System.in);
    static int curr=1;
    public static void main(String [] args){
        int n = sc.nextInt();
        int m = sc.nextInt();
        while(n>0){
            n--;
            if(curr%m==0){
                n++;
            }
            curr++;
        }
        System.out.println(curr-1);
    }
}