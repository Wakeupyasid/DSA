public class lc1869 {
    // 1869. Longer Contiguous Segments of Ones than Zeros
    public static void main(String[] args) {
        String s = "111000";
        int maxOnes=0;
        int maxZeroes=0;
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)=='0'){
                int c=0;
                for (int j=i;j<s.length();j++){
                    if (s.charAt(j)=='0'){
                        c++;
                    }
                    else{
                        break;
                    }
                }
                maxZeroes=Math.max(maxZeroes,c);
            }
            if (s.charAt(i)=='1'){
                int c=0;
                for (int j=i;j<s.length();j++){
                    if (s.charAt(j)=='1'){
                        c++;
                    }
                    else{
                        break;
                    }
                }
                maxOnes=Math.max(maxOnes,c);
            }
        }
        boolean ans=false;
        if (maxOnes>maxZeroes){
            ans=true;
        }
        System.out.println(ans);
    }
}
