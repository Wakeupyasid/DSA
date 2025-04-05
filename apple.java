import java.util.*;

public class apple {
    public static void main(String[] args) {
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
    }
}
