import java.util.HashMap;

public class lc1394 {
    public static void main(String[] args) {
//        1394. Find Lucky Integer in an Array
        int arr[]={2,2,2,3,3};
        int ans=-1;
        HashMap<Integer,Integer>a=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if (a.containsKey(arr[i])){
                a.put(arr[i],a.get(arr[i])+1);
            }
            else {
                a.put(arr[i],1);
            }
        }
        for (int key:a.keySet()){
            if (a.get(key)==key){
                ans=Math.max(ans,key);
            }
        }
        System.out.println(ans);
    }
}
