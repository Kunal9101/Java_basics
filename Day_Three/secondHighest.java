import java.util.*;

public class secondHighest {
    public static void main(String[] args) {
        int [] arr = {45,465,76,7,5,43};

        // by creating function
        int highest = 0;
        int secondHighest = 0;
        for (int i : arr){
            if (i > highest){
                secondHighest = highest;
                highest = i;
            }
            if (i < highest && i > secondHighest){
                secondHighest = i;
            }
        }

        System.out.println("Second Highest element is " + secondHighest);

        //by using sorting
        int len = arr.length;
        Arrays.sort(arr);
        System.out.println("Second highest is"+ arr[len-2]);
    }
}
