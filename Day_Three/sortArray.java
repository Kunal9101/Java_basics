import java.util.Arrays;

public class sortArray {
    public static void main(String[] args) {
        int [] arr = {34,123,45,56,36,635,45};
        System.out.println("Original Array: " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sorting List: "+ Arrays.toString(arr));
    }
}
