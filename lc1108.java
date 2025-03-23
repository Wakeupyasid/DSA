public class lc1108 {
    // 1108. Defanging an IP Address
    public static void main(String[] args) {
        String address = "1.1.1.1";
        String ans="";
        for (int i=0;i<address.length();i++){
            if (address.charAt(i)=='.'){
                ans=ans+"[.]";
            }
            else{
                ans=ans+address.charAt(i);
            }
        }
//        address=address.replace(".","[.]");
        System.out.println(ans);
        System.out.println(address);
    }
}
