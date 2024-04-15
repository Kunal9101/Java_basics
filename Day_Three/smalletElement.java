import java.util.Arrays;

public class smalletElement {
    public static void main(String[] args) {
        int [] arr = {34,32,4,556,7,7,8};

        //by using for loop
        int smallest = arr[0];
        for ( int i = 1 ; i < arr.length ; i++){
            if (arr[i] < smallest){
                smallest = arr[i];
            }
        }
        System.out.println("Smallest element is : "+ smallest);

        //by using sorting
        Arrays.sort(arr);
        System.out.println("Smallest element is : "+ arr[0]);
    }
}
