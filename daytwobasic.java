//day 2 of basics
import java.util.*;





// If Else Statement Problems
//1. Read a single Digit Number and write in word

public class daytwobasic {
    public static void main(String[] args) {
        //User input
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Single digit number:");
        int inp = scan.nextInt();

        //If Else if else condition
        if (inp == 1){
            System.out.println("One");
        }
        else if(inp == 2){
            System.out.println("Two");
        }
        else if(inp == 3){
            System.out.println("Three");
        }
        else if(inp == 4){
            System.out.println("Four");
        }
        else if(inp == 5){
            System.out.println("Five");
        }
        else if(inp == 6){
            System.out.println("Six");
        }
        else if(inp == 7){
            System.out.println("Seven");
        }
        else if(inp == 8){
            System.out.println("Eight");
        }
        else if(inp == 9){
            System.out.println("Nine");
        }
        else{
            System.out.println("Invalid Value entered ");
        }
    }
    
}





// 2. Read a Number 1,10,100,1000 and display unit, ten hundred
public class read {
    public static void main(String[] args) {
        //User input
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = scan.nextInt();

        //If else condition
        if (num == 1){
            System.out.println("One");
        }
        else if (num == 10){
            System.out.println("Ten");
        }
        else if (num == 100){
            System.out.println("Hundread");
        }
        else if (num == 1000){
            System.out.println("Thousand");
        }
        else{
            System.out.println("Not acceptable number");
        }
    }
    
// }



//Programs With While Loop
//1. Write a Program for the sum of n natural numbers eg. Input N=5 output 1+2+3+4+5

public class right {
    public static void main(String[] args) {
        //User input
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number upto you want to add:");
        int user_input = scan.nextInt();

        //while
        int i = 1;
        int sum = 0;
        while(i <= user_input){
            sum = sum + i;
            i++;
        }
        System.out.println("Addition upto "+ user_input + " is "+ sum);
    }
    
}


//2. Write a Program to reverse the integer number eg. Input n=231 reverse is 132
public class left {
    public static void main(String[] args) {
        //user input
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number you want to reverse: ");
        int k = scan.nextInt();

        //function
        int temp = k ;
        int sum = 0; 
        while (k != 0){
            int rem = k % 10;
            sum = (sum * 10) + rem;
            k = k /10 ;
        }
        System.out.println(sum);
    }
    
}


//Programs With For Loop
//1. Write a Program for the sum of n natural numbers eg. Input N=5 output 1+2+3+4+5

public class up {
    public static void main(String[] args) {
        //User input
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number upto you want to add:");
        int user_input = scan.nextInt();

        //for
        int sum = 0;
        for(int i= 1 ; i <= user_input ; i++){

            sum += i;
        }
        System.out.println("Addition upto "+ user_input + " is "+ sum );
    }
    
}




//2. Write a Program to reverse the integer number eg. Input n=231 reverse is 132
public class down {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to reverse:");
        int a = scan.nextInt();

        int sum = 0;
        int rem = 0 ;
        for ( ; a != 0 ; a --){
            rem = a % 10;
            sum = ( sum * 10) + rem;
            a = a / 10;
            a++;
        }
        System.out.println("Reverse number is: "+ sum);
    }
    
}


//3. Write a Program to find Palindrome Number
public class down {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to reverse:");
        int a = scan.nextInt();
        int temp = a;
        int sum = 0;
        int rem = 0 ;
        for ( ; a != 0 ; a --){
            rem = a % 10;
            sum = ( sum * 10) + rem;
            a = a / 10;
            a++;
        }
        if (temp == sum ){
            System.out.println("Number is Palindrom");
        }
        else{
            System.out.println("Number is not a palindrom number");
        }
    }
    
}


//1. Enter two numbers and do the following arithmetic Operations find max and min.
//i) a+b*c ii) c+a/b
//iii) a%b+c iV) a*b+c

public class nowere {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //First variable
        System.out.println("Enter a first number:");
        int first = scan.nextInt();

        //second variable
        System.out.println("Enter second number:");
        int sec = scan.nextInt();

        //findind max and min
        if (first == sec ){
            System.out.println(first + " is maximum and "+ sec + " is minimum");
        }
        else{
            System.out.println(sec + " is maximun and "+ first + " is minimum");
        }

        //third variable
        System.out.println("Enter third number:");
        int third = scan.nextInt();

        //a+b*c
        int ff = first + sec * third ;
        System.out.println(first + " + " + sec + " * "+ third + " = " + ff); 

        //c+a/b
        int ss = third + first / sec ;
        System.out.println(third + " + " + first + " / "+ sec + " = "  +  ss); 

        //iii) a%b+c
        int tt = first % sec + third;
        System.out.println(first + " % " + sec + " + "+ third + " = "  +  tt);

        //iV) a*b+c
        int rrr = first * sec + third;
        System.out.println(first + " * " + sec + " + "+ third + " = "+ rrr);

    }
    
}

//2. Write a program SpringSeason.java that takes two int values m and d from the command line and 
//prints true if day d of month m is between March 20 (m = 3, d=20) and June 20 (m = 6, d = 20), 
//false otherwise.

public class SpringSeason {
    public static void main(String[] args) {
        //user input
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a month : ");
        int month = scan.nextInt();

        System.out.println("Enter a Date: ");
        int date = scan.nextInt();

        //if condition to check 
        if (month >= 3 && month<=6){
            if (date >= 20 && date<=31){
                System.out.println("Its Springe season");;
            }
        else{
            System.out.println("Not a Spring season");
        }
        }
    }  
}


//Write a program Distance.java that takes two integer command-line arguments x and y and 
//prints the Euclidean distance from the point (x, y) to the origin (0, 0). The formulae to 
//calculate distance = sqrt(x*x + y*y). Use Math.power function

public class Distance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //values of x and y
        System.out.println("print value for x: ");
        int x = scan.nextInt();

        System.out.println("Enter value for Y:");
        int y = scan.nextInt();

        //finding power
        double power_x = Math.pow(x, 2);
        double power_y = Math.pow(y, 2);

        //square root
        double square;
        square = Math.sqrt(power_x + power_y);

        System.out.println("Euclidine Distance is " + square);
    }
    
}