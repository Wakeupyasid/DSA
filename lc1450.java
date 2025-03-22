public class lc1450 {
    // 1450. Number of Students Doing Homework at a Given Time
    public static void main(String[] args) {
        int startTime[]={4};
        int endTime[]={4};
        int queryTime = 4;
        int ans=0;
        for (int i=0;i< startTime.length;i++){
            if (startTime[i]<=queryTime && queryTime<=endTime[i]){
                ans++;
            }
        }
        System.out.println(ans);
    }
}
