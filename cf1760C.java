import java.util.*;
public class cf1760C {
    static int m1,m2=0;
    static int [] arr;
    static Scanner sc = new Scanner(System.in);
    public static void main(String [] args){
        int l=0;
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            l=sc.nextInt();
            arr = new int[l];
            input(l);
        }
    }
    static void input(int l){
        m1=0;
        m2=0;
        for(int i=0;i<l;i++){
            arr[i]=sc.nextInt();
            if(arr[i]>=m1){
                m2=m1;
                m1=arr[i];
            }
            if(arr[i]>m2 && arr[i]!=m1){
                m2=arr[i];
            }
        }
        for(int i=0;i<l;i++){
            if(arr[i]!=m1){
                System.out.print(arr[i]-m1+" ");
            }else{
                System.out.print(arr[i]-m2+" ");
            }
        }
        System.out.println();
        return;
    }
}