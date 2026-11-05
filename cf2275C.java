import java.util.*;
public class cf2275C{
    static Scanner sc = new Scanner(System.in);
    static Map<Long,Long> map =new HashMap<>();
    static int n;
    static long sum,c;
    static long [] arr;
    public static void main(String [] args){
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            n=sc.nextInt();
            arr = new long[n];
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
            sum=arr[i]+arr[i+2]-arr[i+4];
            if(map.containsKey(sum)){
                map.put(sum,map.get(sum)+1);
            }else{
                map.put(sum,(long)1);
            }
        }
        for(Long k:map.keySet()){
            if(map.get(k)>1){
                c+=((map.get(k))*(map.get(k)-1))/2;             
            }
        }
        return c;
    }
}