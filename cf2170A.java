import java.util.*;
public class cf2170A{
    static Scanner sc = new Scanner(System.in);
    public static void main(String [] args){
        int t = sc.nextInt();
        int n;
        for(int i=0;i<t;i++){
            n = sc.nextInt();
            if(n==1){
                System.out.println(n*n);
            }else if(n==2){
                System.out.println((3*n*n)-n-1);
            }else if(n>=3 && n<=4){
                System.out.println((4*n*n)-n-4);
            }else if(n>=5){
                System.out.println((5*n*n)-5*n-5);
            }
        }
    }
}