import java.util.*;
public class cf1788A{
    static int [] arr;
    static int n,count=0;
    static Scanner sc = new Scanner(System.in);
    public static void main(String [] args){
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            n=sc.nextInt();
            arr = new int[n];
            System.out.println(input(n));            
        }
    }
    static int input(int n){
        count=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]==2){
                count++;
            }
        }
        if(count%2==0 && count!=0){
            return find(count/2);
        }else if(count%2!=0){
            return -1;
        }else if(count==0){
            return 1;
        }
        return 0;
    }
    static int find(int k){
        int c=0;
        for(int i=0;i<n;i++){
            if(arr[i]==2){
                c++;
            }
            if(c==k){
                return i+1;
            }
        }
        return 0;
    }
}