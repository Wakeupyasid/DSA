public class lc3184 {
    public static void main(String[] args) {
        int hours[] = {72,48,24,3};
        int ans=0;
        for (int i=0;i< hours.length;i++){
            for (int j=i;j< hours.length;j++){
                if (i!=j){
                    int t=hours[i]+hours[j];
                    if (t%24==0){
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
