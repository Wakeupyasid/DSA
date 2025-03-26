public class lc3131 {
    // 3131. Find the Integer Added to Array I
    public static void main(String[] args) {
        int nums1[]={2,6,4};
        int nums2[]={9,7,5};
        int n1m=0;
        int n2m=0;
        for (int i=0;i< nums1.length;i++){
            n1m=Math.max(nums1[i],n1m);
        }
        for (int i=0;i< nums2.length;i++){
            n2m=Math.max(nums2[i],n2m);
        }
        int ans=n2m-n1m;
        System.out.println(ans);

//        Arrays.sort(nums1);
//        Arrays.sort(nums2);
//        int ans=nums2[0]-nums1[0];
//        System.out.println(ans);
    }
}
