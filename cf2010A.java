import java.util.*;
public class cf2010A{
    static Scanner sc = new Scanner(System.in);
    static int [] arr;
    static int n,sum;
    public static void main(String [] args){
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            n=sc.nextInt();
            sum=0;
            arr = new int[n];
            System.out.println(calc());
        }
    }
    static int calc(){
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if((i+1)%2!=0){
                sum+=arr[i];
            }else{
                sum-=arr[i];
            }
        }
        return sum;
    }
}