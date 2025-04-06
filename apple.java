import java.util.*;

public class apple {
    public static void main(String[] args) {
<<<<<<< HEAD
        String coordinates = "h3";
        int a=coordinates.charAt(0);
        int b=coordinates.charAt(1);
        int c=a+b;
        boolean ans=true;
        if (c%2==0){
            ans=false;
        }
        System.out.println(ans);
=======
        String s = "abbaca";
        int k=0;
        Stack<Character>ch=new Stack<>();
        ch.push(s.charAt(0));
        for (int i=1;i<s.length()-1;i++){

            if (s.charAt(i)==ch.peek()){
                ch.pop();
            }
            else if (s.charAt(i)!=ch.peek()){

                ch.push(s.charAt(i));
            }
            System.out.println(ch+""+k++);
        }
        System.out.println(ch);
>>>>>>> ebe6f08bec39e86e96cdbd0e77711a6ba0eaa5ea
    }
}
