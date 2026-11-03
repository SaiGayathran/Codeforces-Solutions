import java.util.*;
public class cf2048A{
    static Scanner sc = new Scanner(System.in);
    static int x;
    public static void main(String [] args){
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            x=sc.nextInt();
            System.out.println(find());
        }
    }
    static String find(){
        if(x%33==0){
            return "YES";
        }else{
            return "NO";
        }
    }
    
}