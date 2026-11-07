import java.util.*;
public class cf2269B{
    static Scanner sc = new Scanner(System.in);
    static int [] arr;
    static HashMap<Integer,Integer> map= new HashMap<>();
    static int n,num,s,c1,c4;
    public static void main(String [] args){
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            n=sc.nextInt();
            arr = new int[n];
            c1=0;
            c4=0;
            map.clear();
            System.out.println(check());
        }
    }
    static int check(){
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            num=arr[i];
            for(int j=0;j<12;j++){
                s=0;
                while(num>0){
                    s+=Math.pow(num%10,2);
                    num=num/10;
                }
                num=s;
            }
            if(num==1){
                map.put(-1,map.getOrDefault(-1,0)+1);
            }else{
                map.put(num,map.getOrDefault(num,0)+1);
            }
        }
        c1=map.getOrDefault(-1,0);
        c1=(c1*(c1-1))/2;
        for(int k:map.keySet()){
            if(k>0){
                if(map.get(k)>1){
                    c4+=(map.get(k)*(map.get(k)-1))/2;
                }                
            }
        }
        return c1+c4;
    }
}