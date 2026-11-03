import java.util.*;
public class cf1714B{
    static Scanner sc = new Scanner(System.in);
    static int len,a,ans;
    static int [] arr;
    static boolean [] seen;
    public static void main(String [] args){
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            a=sc.nextInt();
            seen = new boolean[a+1];
            arr = new int[a];           
            input(a);
        }
    }
    static void input(int a){
        ans=0;
        for(int i=0;i<a;i++){
            arr[a-1-i]=sc.nextInt();        
            }
        for(int i=0;i<a;i++){
            if(!seen[arr[i]]){
                seen[arr[i]]=true;
                ans++; 
            }else{
                break;
            }
        }
        System.out.println(a-ans);
        return;
    }
}