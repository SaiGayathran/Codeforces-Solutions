import java.util.*;
public class cf2275C{
    static Scanner sc = new Scanner(System.in);
    static Map<Long,Long> map =new HashMap<>();
    static int n;
    static long c;
    static long [] arr,s;
    public static void main(String [] args){
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            n=sc.nextInt();
            arr = new long[n];
            s=new long[n-4];
            c=0;
            map.clear();
            System.out.println(check());
        }
    }
    static long check(){
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();
        }
        for(int i=0;i<n-4;i++){
            s[i]=arr[i]+arr[i+2]-arr[i+4];
            if(map.containsKey(s[i])){
                map.put(s[i],map.get(s[i])+1);
            }else{
                map.put(s[i],1L);
            }
        }
        for(Long k:map.keySet()){
            if(map.get(k)>1){
                c+=((map.get(k))*(map.get(k)-1))/2;             
            }
        }
        for(int i=0;i<n;i++){
            if(i<n-6 && s[i]==s[i+2]){
                c--;
            }
            if(i<n-8 && s[i]==s[i+4]){
                c--;
            }
        }
        return c;
    }
}