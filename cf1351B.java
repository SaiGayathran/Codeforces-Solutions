import java.util.*;
public class cf1351B{
    static Scanner sc = new Scanner(System.in);
    static int [] arr = new int[4];
    static int s;
    public static void main(String [] args){
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            s=0;
            System.out.println(check());
        }
    }
    static String check(){
        for(int i=0;i<4;i++){
            arr[i]=sc.nextInt();
            s+=arr[i];
        }
        if(s%3==0){
            s=s/3;
            if(s==arr[0] || s==arr[1]){
                if(s==arr[2] || s==arr[3]){
                    return "YES";
                }else{
                    return "NO";
                }
            }else{
                return "NO";
            }
        }else{
            return "NO";
        }
    }
}