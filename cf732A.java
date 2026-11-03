import java.util.*;
public class cf732A{
    static Scanner sc = new Scanner(System.in);
    public static void main(String [] args){
        int k = sc.nextInt();
        int r = sc.nextInt();
        boolean flag=false;
        for(int i=1;i<10;i++){
            if(k*i%10 == 0 || k*i%10==r){
                flag=true;
                System.out.println(i);
                break;
            }
        }
        if(!flag){
            System.out.println(10);
        }
    }
}