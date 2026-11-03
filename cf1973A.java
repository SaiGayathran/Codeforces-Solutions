import java.util.*;
public class cf1973A{
    static Scanner sc = new Scanner(System.in);
    static int p1,p2,p3,count;
    public static void main(String [] args){
        int t =sc.nextInt();
        for(int i=0;i<t;i++){
            p1=sc.nextInt();
            p2=sc.nextInt();
            p3=sc.nextInt();
            count=0;
            System.out.println(find());
        }
    }
    static int find(){
        if((p1+p2+p3)%2==0){
            if(p3!=0){
                if(p2>=p1 && p2>0){
                    p3--;
                    p2--;
                    count++;
                    return find();
                }else if(p1>p2 && p1>0){
                    p3--;
                    p1--;
                    count++;
                    return find();
                }            
            }else if(p2!=0){
                p2--;
                p1--;
                count++;
            }else{
                if(p1%2!=0){
                    return -1;
                }
            }
            return count;        

        }else{
            return -1;
        }     
    }
}