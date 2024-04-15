
public class printElement {
    public static void main(String[] args) {
        int [] arr = {2,4,5,6,7,3,6};
        
        //using for loop
        System.out.println("By using for loop");
        for (int i = 0; i < arr.length ; i++){
            System.out.println(arr[i]);
        }

        //using for each loop
        System.out.println("By using For each loop");
        for (int i : arr){
            System.out.println(i);
        }
    }
}
