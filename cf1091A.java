import java.util.*;
public class cf1091A{
    static Scanner sc = new Scanner(System.in);
    public static void main(String [] args){
        int y=sc.nextInt();
        int b=sc.nextInt();
        int r=sc.nextInt();
        int m=Math.min(y+2,Math.min(b+1,r));
        System.out.println(3*m-3);
    }
}