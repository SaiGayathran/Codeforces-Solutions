import java.util.*;
public class cf2276B{
    static Scanner sc = new Scanner(System.in);
    static String s;
    static int di,sa,c;
    public static void main(String [] args){
        int t =sc.nextInt();
        for(int i=0;i<t;i++){
            s=sc.next();
            di=0;
            sa=0;
            c=1;
            c+=count();
            System.out.println(c);
        }
    }
    static int count(){
        c=1;
        int i=0;
        while(i<s.length()-2){
            if(s.charAt(i)==s.charAt(i+2)&&s.charAt(i)!=s.charAt(i+1) && di==0){
                di++;
                i=i+2;
            }else if(s.charAt(i)==s.charAt(i+2)&&s.charAt(i)==s.charAt(i+1) && sa==0){
                sa++;
                i=i+2;
            }else{
                i++;
            }
        }
        return di+sa;
    }
}