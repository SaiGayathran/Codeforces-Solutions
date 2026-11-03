import java.util.*;
public class cf2250A{
    static Scanner sc = new Scanner(System.in);
    static int [] arr;
    static int n;
    public static void main(String [] args){
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            n=sc.nextInt();
            arr = new int[n];
            if(possible()){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
    static boolean possible(){
        int R = Integer.MAX_VALUE;
        int L = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if((i+1)%2!=0){
                if(arr[i]<R)
                    R=arr[i];
            }else{
                if(arr[i]>L)
                    L=arr[i];
            }
        }
        if(n%2!=0){
            return false;
        }
        if(R-L>1){
            return true;
        }else{
            return false;
        }
    }
}