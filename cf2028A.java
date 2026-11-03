import java.util.*;
public class cf2028A{
    static Scanner sc = new Scanner(System.in);
    static int n,a,b,dx,dy,x,y;
    static String s;
    public static void main(String [] args){
        int t =sc.nextInt();
        for(int i=0;i<t;i++){
            n=sc.nextInt();
            a=sc.nextInt();
            b=sc.nextInt();
            s=sc.next();
            dx=0;
            dy=0;
            x=0;
            y=0;
            System.out.println(confirm());
        }
    }
    static String confirm(){
        for(int j=0;j<n;j++){
            if(s.charAt(j)=='N'){
                dy++;
            }else if(s.charAt(j)=='E'){
                dx++;
            }else if(s.charAt(j)=='W'){
                dx--;
            }else if(s.charAt(j)=='S'){
                dy--;
            }
        }
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='N'){
                if(check(x,++y)){
                    return "YES";
                }
            }else if(s.charAt(i)=='E'){
                if(check(++x,y)){
                    return "YES";
                }
            }else if(s.charAt(i)=='W'){
                if(check(--x,y)){
                    return "YES";
                }
            }else{
                if(check(x,--y)){
                    return "YES";
                }
            }
        }
        return "NO";   
    }
    static boolean check(int x,int y){
        if(dx==0 && dy==0){
            if(a==x && b==y){
                return true;
            }else{
                return false;
            }
        }else if(dx==0 && dy!=0){
            if(a==x && (b-y)%dy==0 && (b-y)/dy>=0){
                return true;
            }else{
                return false;
            }
        }else if(dy==0 && dx!=0){
            if(b==y && (a-x)%dx==0 && (a-x)/dx>=0){
                return true;
            }else{
                return false;
            }
        }else{
            if((a-x)%dx==0 && (b-y)%dy==0 && (a-x)/dx==(b-y)/dy && (a-x)/dx>=0){
                return true;
            }else{
                return false;
            }
        }
    }
}
