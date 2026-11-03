import java.util.*;
public class cf1722C{
    static int n,m,c;
    static boolean p,q;
    static String [] str1,str2,str3;
    static Scanner sc = new Scanner(System.in);
    public static void main(String [] args){
        n = sc.nextInt();
        for(int i=0;i<n;i++){
            m=sc.nextInt();
            str1=new String [m];
            str2=new String [m];
            str3=new String [m];
            words(m);
        }
    }
    static void words(int m){
        for(int i=0;i<3*m;i++){
            if(i<m){
                str1[i]=sc.next();
            }else if(i<2*m){
                str2[i-m]=sc.next();
            }else if(i<3*m){
                str3[i-2*m]=sc.next();
            }
        }
        System.out.println(score(str1,str2,str3)+" "+score(str2,str3,str1)+" "+score(str3,str1,str2));
    }
    static int score(String [] curr, String [] x, String [] y){
        c=0;
        for(int i=0;i<m;i++){
            p = common(curr[i],x);
            q = common(curr[i],y);
            if(p&&q){
                c+=0;
            }else if(p||q){
                c+=1;
            }else{
                c+=3;
            }
        }
        return c;
    }
    static boolean common(String a, String [] s){
        for(int i=0;i<m;i++){
            if(a.equals(s[i])){
                return true;
            }
        }
        return false;
    }
}