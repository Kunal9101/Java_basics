//Day 1 of basic java programming




import java.util.*;


// 1.1 Write a program to display any message:
public class dayonebasic {
    public static void main(String[] args) {
        System.out.println("Hello User!!!");
    }
}







// 1.2 Write a Java program to display the default value of all primitive data types of Java
public class default_values{
    static byte a ;
    static short b ;
    static int c ; 
    static long d ; 
    static float e ; 
    static double f ; 
    static boolean g ; 
    static char i ;
    public static void main(String[] args) {
        System.out.println("Defalt value of byte is " + a );
        System.out.println("Defalt value of short is " + b );
        System.out.println("Defalt value of int is " + c );
        System.out.println("Defalt value of long is " + d );
        System.out.println("Defalt value of float is " + e );
        System.out.println("Defalt value of double is " + f );
        System.out.println("Defalt value of boolean is " + g );
        System.out.println("Defalt value of char is " + i );

    }
}






// 1.3 Write a program to check two strings are equal or not.
public class check{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //first input
        System.out.println("Enter First Character:");
        String first= scan.nextLine();

        //second input
        System.out.println("Enter Second Character:");
        String second = scan.nextLine();

        if (first.equals(second)){
            System.out.println("Both Strings are same");
        }
        else{
            System.out.println("Both Stringd are different");
        }
    }
}







// 1.4 To find the sum of command-line arguments 
public class sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int a = scan.nextInt();

        System.out.println("Enter Second Number: ");
        int b = scan.nextInt();

        //output
        int z = a+b;
        System.out.println("The sum of "+ a + " and " + b + " is "+ z);
    }
}







// 1.5 To get the name using the command line.
public class take_name {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your name ");
        String name = scan.nextLine();
        System.out.println("Hello "+ name + " ,How are you!! ");
    }
}







// 1.6 Write a program to demonstrate static variables, methods, and blocks.
public class test_task{
    //static varible
    static int a =10;
    static int b = 20;

    //method
    public int sum_two(int x , int y ){
        int result = x + y;
        return result; 
    }
    
    public static void main(String[] args) {
        int c = 30;
        int d = 40;
        test_task obj = new test_task();
        int result = obj.sum_two(c, d);
        System.out.println("Sum of "+ c + " and " + d + " is " + result);

        int z = obj.sum_two(a, b);
        System.out.println("Sum of "+ a + " and " + b + " is " + z);
        
    }
}







// 1.7 Write a LeapYear.java program that takes a year as input and outputs the Year is a Leap Year or not a Leap Year.
public class nono{
    public static void main(String[] args) {
        //user input
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Year to check wheater leap year or not");
        int year = scan.nextInt();

        //checking wheater a leap year or not
        if (year >= 1582){
            if (year % 4 == 0  && year % 100 != 0 ){
                System.out.println("Yess Its an leap year!!!");
            }
            else{
                System.out.println("Not a leap year");
            }

        }
        else{
            System.out.println("Not a leap year");
        }
    }
}