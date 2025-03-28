public class lc1346 {
    public static void main(String[] args) {
        int arr[]={-10,12,-20,-8,15};
        boolean ans=false;
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                if (arr[j]==arr[i]*2 || i!=j){
                    ans=true;
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}
