import java.util.Arrays;

public class lc1720 {
    // 1720. Decode XORed Array
    public static void main(String[] args) {
        int encoded[]={1,2,3};
        int first=1;
        int n = encoded.length;
        int[] decodedArray = new int[n + 1];
        decodedArray[0] = first;
        for (int i = 0; i < n; ++i) {
            decodedArray[i + 1] = decodedArray[i] ^ encoded[i];
        }
        System.out.println(Arrays.toString(decodedArray));
    }
}
