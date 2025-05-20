public class lc2696 {
    // 2696. Minimum String Length After Removing Substrings
    public static void main(String[] args) {
        String s = "ABFCACDB";
        while (s.contains("AB")|| s.contains("CD")){
            s=s.replaceAll("AB","");
            s=s.replaceAll("CD","");
        }
        int ans=s.length();
    }
}
