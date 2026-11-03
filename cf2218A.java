import java.util.*;
public class cf2218A{
    static Scanner sc = new Scanner(System.in);
    public static void main(String [] args){
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            if(n<67){
                System.out.println(n+1);
            }else{
                System.out.println(67);
            }
        }
    }
}