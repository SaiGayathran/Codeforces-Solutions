import java.util.*;
public class cf1743A{
    static int [] arr;
    static int k,m;
    static Scanner sc = new Scanner(System.in);
    public static void main(String [] args){
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            m = sc.nextInt();
            System.out.println(input());
        }
    }
    static int input(){
        for(int i=0;i<m;i++){
            k=sc.nextInt();
        }
        k=10-m;
        return k*(k-1)*3;
    }
}