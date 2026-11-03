import java.util.*;
public class cf764A{
    static Scanner sc = new Scanner(System.in);
    public static void main(String [] args){
        String s = sc.nextLine();
        String [] str = s.split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        int z = Integer.parseInt(str[2]);
        int kill=0;
        for(int i=n;i<=z;i+=n){
            for(int j=m;j<=z;j+=m){
                if(i==j){
                    kill++;
                }
            }
        }
        System.out.println(kill);
    }
}