import java.util.*;
public class cf2271B{
    static Scanner sc = new Scanner(System.in);
    static int n,k,mex;
    static int [] a,freq;
    public static void main(String [] args){
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            n=sc.nextInt();
            k=sc.nextInt();
            a=new int[n];
            freq=new int[n+1];
            mex=0;
            System.out.println(find());
        }
    }
    static String find(){
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            freq[a[i]]++;
        }
        for(int i:freq){
            if(i<2*k){
                mex=i;
                break;
            }
        }
        if(mex==2*k-1){
            return "YES";
        }else{
            return "NO";
        }
    }
}