import java.util.*;
public class cf2133A{
    static Scanner sc = new Scanner(System.in);
    static int [] arr;
    static int m;
    static double tl,tr,vl,vr;
    public static void main(String [] args){
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            m = sc.nextInt();
            arr = new int[m];
            if(find(m)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }    
        }
    }
    static boolean find(int m){
        vl=1.0;
        for(int i=0;i<m;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++){
            for(int j=i+1;j<m;j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
}