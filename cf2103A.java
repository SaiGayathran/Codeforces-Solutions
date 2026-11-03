import java.util.*;
public class cf2103A{
    static Scanner sc = new Scanner(System.in);
    static int [] arr;
    static boolean [] flag;
    static int n,c;
    public static void main(String [] args){
        n = sc.nextInt();
        for(int i =0;i<n;i++){
            flag = new boolean[101];
            c=0;
            System.out.println(find());
        }
    }
    static int find(){
        int l = sc.nextInt();
        arr = new int[l];
        for(int i = 0;i<l;i++){
            arr[i] = sc.nextInt();
            if(!flag[arr[i]]){
                c++;
                flag[arr[i]]=true;
            }
        }
        return c;
    }
}