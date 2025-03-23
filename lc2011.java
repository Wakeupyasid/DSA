public class lc2011 {
//    2011. Final Value of Variable After Performing Operations
    public static void main(String[] args) {
        String operations[]={"--X","X++","X++"};
        int ans=0;
        for (int i=0;i< operations.length;i++){
            if (operations[i].equals("--X") || operations[i].equals("X--")){
                ans=ans-1;
            }
            if (operations[i].equals("++X") || operations[i].equals("X++")){
                ans=ans+1;
            }
        }
        System.out.println(ans);
    }
}
