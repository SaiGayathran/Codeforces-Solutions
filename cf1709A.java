import java.util.*;
public class cf1709A{
    static int [] arr;
    static int key,f,check;
    static Scanner sc = new Scanner(System.in);
    public static void main(String [] args){
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            arr = new int[3];
            key = sc.nextInt();
            if(find()){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
    static boolean find(){
        f=0;
        for(int i=0;i<3;i++){
            arr[i]=sc.nextInt();
        }
        check = key-1;
        while(arr[check]!=0){
            f++;
            check=arr[check]-1;           
        }
        if(f==2){
            return true;
        }else{
            return false;
        }
    }
}