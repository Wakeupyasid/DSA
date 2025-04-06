public class lc1287 {
    // 1287. Element Appearing More Than 25% In Sorted Array
    public static void main(String[] args) {
        int arr[]={5668,5668,5668,5668,22011};
        int n=arr.length;
        int ans=0;
        for (int i=0;i< arr.length;i++){
            int c=0;
            for (int j=i;j< arr.length;j++){
                if (arr[j]==arr[i]){
                    c++;
                }
                else break;
            }
            float t=n/4;
            if (c>=t){
                ans=arr[i];
                i=i+c;
            }
            else i=i+c;
        }
        System.out.println(ans);
    }
}
