//billing machine by using switch case
import java.util.*;
public class Billing_counter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Constance 
        int sprite = 40;
        int thumbsup = 40;
        int maza = 45;
        int bisleri = 20 ;
        int jeera = 10;

        //taking input from user
        System.out.println("Enter code number of product:");
        int code = scan.nextInt();
        System.out.println("Quantity of product:");
        int quantity = scan.nextInt();
        scan.closed();
        
        //switch case for actual function run
        switch (code) {
            case 1:
                int total = sprite * quantity;
                System.out.println("------------------------------------------");
                System.out.println("           Mayuresh Kirana Store          ");
                System.out.println("------------------------------------------");
                System.out.println("item name  |  quantity  |   rate   | total");
                System.out.println("  Sprite   |   " + quantity + "        |    " + sprite + "    |  " + total );
                System.out.println("------------------------------------------");
                System.out.println("         Thank you for visit              ");
                break;

            case 2:
                int tota = thumbsup * quantity;
                System.out.println("------------------------------------------");
                System.out.println("           Mayuresh Kirana Store          ");
                System.out.println("------------------------------------------");
                System.out.println("item name  |  quantity  |   rate   | total");
                System.out.println(" Thumbsup  |   " + quantity + "        |    " + thumbsup + "    |  " + tota );
                System.out.println("------------------------------------------");
                System.out.println("         Thank you for visit              ");
                break;
            
            case 3:
                int tot = maza * quantity;
                System.out.println("------------------------------------------");
                System.out.println("           Mayuresh Kirana Store          ");
                System.out.println("------------------------------------------");
                System.out.println("item name  |  quantity  |   rate   | total");
                System.out.println("   Maaza   |   " + quantity + "        |    " + maza + "    |  " + tot );
                System.out.println("------------------------------------------");
                System.out.println("         Thank you for visit              ");
                break;
            
            case 4:
                int to = bisleri * quantity;
                System.out.println("------------------------------------------");
                System.out.println("           Mayuresh Kirana Store          ");
                System.out.println("------------------------------------------");
                System.out.println("item name  |  quantity  |   rate   | total");
                System.out.println("  Bisleri  |   " + quantity + "       |    " + bisleri + "    |  " + to );
                System.out.println("------------------------------------------");
                System.out.println("         Thank you for visit              ");
                break;
            
            case 5:
                int t = jeera * quantity;
                System.out.println("------------------------------------------");
                System.out.println("           Mayuresh Kirana Store          ");
                System.out.println("------------------------------------------");
                System.out.println("item name  |  quantity  |   rate   | total");
                System.out.println("  Jeera    |   " + quantity + "        |    " + jeera + "    |  " + t );
                System.out.println("------------------------------------------");
                System.out.println("         Thank you for visit              ");
                break;
    
            default:
                System.out.println("Invalid code!!!");
                break;
        }
    }
}
