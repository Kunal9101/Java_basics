import java.util.Arrays;

public class largestElement {
    public static void main(String[] args) {
        int [] arr = {3,4,5,2,4,5,6,69,45,66};
        

    //by using for loop
    int highest = 0;
    for (int i:  arr){
        if (i > highest){
            highest = i;
        }
    }
    System.out.println("Highest element is: " + highest);

    //by using sort
    Arrays.sort(arr);
    System.out.println("Highest element is "+ arr[arr.length -1]);

    }
}
