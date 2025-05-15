public class lc605 {
    // 605. Can Place Flowers
    public static void main(String[] args) {
        int flowerbed[]={0,0,1,0,0};
        int n=1;
        if (flowerbed.length!=1){
            if (flowerbed[0]==0 && flowerbed[1]==0){
                flowerbed[0]=1;
                n--;
            }
            if (flowerbed[flowerbed.length-1]==0 && flowerbed[flowerbed.length-2]==0){
                flowerbed[flowerbed.length-1]=1;
                n--;
            }
        }
        else if (flowerbed.length==1 && n>0){
            if (flowerbed[0]==0){
                flowerbed[0]=1;
                n--;
            }
        }
        if (n!=0 && flowerbed.length>2){
            for (int i=1;i< flowerbed.length-1;i++){
                if (flowerbed[i-1]==0 && flowerbed[i]==0 && flowerbed[i+1]==0){
                    flowerbed[i]=1;
                    n--;
                }
                if (n==0){
                    break;
                }
            }
        }
        boolean ans=true;
        if (n>=1){
            ans=false;
        }
        System.out.println(ans);
    }
}
