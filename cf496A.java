import java.util.*;
public class cf496A{
    static Scanner sc = new Scanner(System.in);
    static int [] arr;
    public static void main(String [] args){
        int n=sc.nextInt();
        arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int [] diff = new int[n-1];
        for(int i=0;i<n-1;i++){
            diff[i]=arr[i+1]-arr[i];
            if(max<(arr[i+1]-arr[i])){
                max=arr[i+1]-arr[i];
            }
        }
        int result=Integer.MAX_VALUE;
        for(int i=0;i<diff.length-1;i++){
            if(diff[i]+diff[i+1]<=max){
                result=max;
                break;
            }else{
                result=Math.min(result,diff[i]+diff[i+1]);
            }
        }
        System.out.println(result);
    }
}