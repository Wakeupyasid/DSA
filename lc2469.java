import java.util.Arrays;

public class lc2469 {
//    2469. Convert the Temperature
    public static void main(String[] args) {
        double celsius=36.50;
        double ans[]={(celsius+273.15),(celsius * 1.80 + 32.00)};
        System.out.println(Arrays.toString(ans));
    }
}
