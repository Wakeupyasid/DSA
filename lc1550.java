public class lc1550 {
//    1550. Three Consecutive Odds
    public static void main(String[] args) {
        int arr[]={1,2,34,3,4,5,7,23,12};
        boolean ans=false;
        if (arr.length>=3){
            for (int i=0;i<arr.length-2;i++){
                if (arr[i]%2!=0 && arr[i+1]%2!=0 && arr[i+2]%2!=0){
                    ans=true;
                    break;
                }
            }
        }
        System.out.println(ans);
    }

}
