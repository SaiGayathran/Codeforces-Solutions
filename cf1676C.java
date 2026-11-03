import java.util.*;
public class cf1676C{
    static int min,r,diff;
    static String [] arr;
    static Scanner sc = new Scanner(System.in);
    public static void main(String [] args){
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            arr = new String[n];
            System.out.println(input(n,m));
        }
    }
    static int input(int n,int m){
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                r=calc(arr[i],arr[j],m);
            }
        }
        return r;
    }
    static int calc(String s1, String s2,int m){
        int curr=0;
        for(int i=0;i<m;i++){
            curr += Math.abs(s1.charAt(i)-s2.charAt(i));
        }
        min = Math.min(min,curr);
        return min;
    }
}