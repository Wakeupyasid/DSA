import java.util.*;

public class lc1941 {
    // 1941. Check if All Characters Have Equal Number of Occurrences
    public static void main(String[] args) {
        String s=s = "mmmccmcccccmcccccmmmcmccmmccccmmmcmmcmcmcmcmmmmmmmmmcccmmcmmmcmmcmcmcmmmcmmmcmmccccmcmccmmcmccmmmcmmccccmcmmccmcmmcccmmcmmcmmcmccmmccmcmmcmmccmmccmcccmmcccmmcccccmcmmmmcmccmmmmmmcmmccmccmmcccccccccmcccmmmccmmccccmmcmcmcmcmmcmmcmcmcmccccmmcccmmmccmmcmmmcmmmcmccccmcmcccmmccmm";
        char[] c = s.toCharArray();
        Map<Character, Integer> mp = new HashMap<>();
        for (int i = 0; i < c.length; i++)
        {
            if (mp.containsKey(c[i]))
            {
                mp.put(c[i], mp.get(c[i]) + 1);
            }
            else
            {
                mp.put(c[i], 1);
            }
        }
        List<Integer> b=new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : mp.entrySet())
        {
            b.add(entry.getValue());
        }
        boolean ans=true;
        int k=b.get(0);
        for (int i=0;i<b.size();i++){
            if (b.get(i)!=k){
                ans=false;
                break;
            }
        }
    }
}
