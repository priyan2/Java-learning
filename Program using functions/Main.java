import java.util.*;

//1.Write a Program to find the Maximum and Minimum of the Given Three Numbers using function
public class Main {
    static int  maximum(int num1, int num2, int num3){
        int max = 0;
           if(num1 > num2 && num1 > num3){
               max = num1;
           }
           else if (num2 > num3 && num2 > num1 ) {
               max = num2;
           }
           else{
               max = num3;
           }
           return max;
    }
    static int minimum(int num1, int num2, int num3){
        int min = 0;
        if(num1 < num2 && num1 < num3){
            min = num1;
        }
        else if (num2 < num1 && num2 < num3 ) {
            min = num2;
        }
        else{
            min = num3;
        }
        return min;
    }
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter first number : ");
       int number1 = in.nextInt();
       System.out.println("Enter first number : ");
       int number2 = in.nextInt();
       System.out.println("Enter first number : ");
       int number3 = in.nextInt();
       System.out.println("Maximum number is : " + maximum(number1,number2,number3));
       System.out.println("Minimum number is : "+ minimum(number1,number2,number3));
    }
}

//2.Write a Program to find out whether the given number is odd or even using function
 public class Main{
     static String oddOrEven(int num){
         if((num % 2) == 0){
             return "Number is even";
         }
         return "Number is even";
     }
     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         int number = in.nextInt();
         System.out.println(oddOrEven(number));;
     }
 }

//3.Program in java to check the person is eligible to vote using the function.
public class Main{
    static String eligibility(int num){
        if(num >= 18){
            return "Eligible to vote";
        }
        return "Not eligible to vote";
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int number = in.nextInt();
        System.out.print(eligibility(number));
    }
}

//4.write a program in java to find sum of two numbers using the function.
public class Main{
    static int sumOfTwoNumbers(int num1,int num2){
        int sum = num1 + num2;
        return sum;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int num1 = in.nextInt();
        System.out.println("Enter the second number : ");
        int num2 = in.nextInt();
        System.out.print("Sum is : "+sumOfTwoNumbers(num1,num2));
    }
}

//5.Write a program in java that returns the product of two numbers entered by the user
public class Main{
    static int productOfTwoNumbers(int num1,int num2){
        int product = num1 * num2;
        return product;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int num1 = in.nextInt();
        System.out.println("Enter the second number : ");
        int num2 = in.nextInt();
        System.out.print("Sum is : "+productOfTwoNumbers(num1,num2));
    }
}