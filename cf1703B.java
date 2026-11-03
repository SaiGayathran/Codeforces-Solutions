import java.util.*;
public class cf1703B{
    static Scanner sc = new Scanner(System.in);
    static int n,m,l,count,k,j,i=0;
    static String s;
    static char [] solved;
    static boolean exists(char c){
        if(m>-1){
            if(solved[m]!=c){
                m--;
                return exists(c);
            }
            else{
                return true;
            }
        }
        return false;
    }
    static void extra(char ch){
        m=k-1;
        if(!exists(ch)){
            solved[k]=ch;
            k++;
        }
        j++;
        if(j<l){
            extra(s.charAt(j));
        }
    }
    static void balloons(){
        count=0;
        l = sc.nextInt();
        s = sc.next();
        count=s.length();
        solved = new char[s.length()];
        k=0;
        j=0;
        extra(s.charAt(j));
        i++;
        System.out.println(count+k);
        if(i<n){
            balloons();
        }else{
            return;
        }
    }
    public static void main(String [] args){
        n = sc.nextInt();
        balloons();
    }  
}