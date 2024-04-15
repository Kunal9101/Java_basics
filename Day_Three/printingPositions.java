
public class printingPositions {
    public static void main(String[] args) {
        int [] arr = {34,4,6,6,54,45,32,3};

        //printing only even positions
        System.out.println("Printing Elements at even position:");
        for (int i=1 ; i < arr.length ; i++ ){
            System.out.println(arr[i]);
            i++;
        }

        //printing only odd position
        System.out.println("Printing Elements at odd position:");
        for (int i=0 ; i < arr.length ; i++ ){
            System.out.println(arr[i]);
            i++;
        }


    }
}