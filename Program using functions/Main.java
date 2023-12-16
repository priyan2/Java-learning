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

//6.Java Program to Calculate Area and Circumference of Circle
public class Main{
    static double circumferenceOfCircle(double num){
        double ans = 2 * 3.14 * num;
        return ans;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius : ");
        double r = in.nextDouble();
        System.out.print("Circumference of the circle is : "+circumferenceOfCircle(r));
    }
}

//7.Define a method to find out if a number is prime or not.
public class Main {
    static String isPrime(int num){
        int count = 0;
        if(num == 1){
            return "Not prime nor composite";
        }
        for(int i = 2; i <= (num/2); i++){
            if(num % i == 0){
                count++;
            }
        }
        if(count > 0){
            return "Not a prime number";
        }
        return "Prime number";
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = in.nextInt();
        System.out.println(isPrime(num));

    }
}

//8.Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks as below.
         Marks        Grade
        91-100         AA
        81-90          AB
        71-80          BB
        61-70          BC
        51-60          CD
        41-50          DD
        <=40          Fail
public class Main {
    static String gradeCheck(int marks){
        if(marks > 90 && marks < 101){
            return "AA";
        } else if (marks > 80 && marks < 91) {
            return "AB";
        } else if (marks > 70 && marks < 81) {
            return "BB";
        } else if (marks > 60 && marks < 71) {
            return "BC";
        } else if (marks > 50 && marks < 61 ) {
            return "CD";
        } else if (marks > 40 && marks < 51) {
            return "DD";
        } else if (marks < 41) {
            return "Fail";
        }
        return "Please enter a valid mark";
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the mark : ");
        int num = in.nextInt();
        System.out.println(gradeCheck(num));

    }
}

//9.Write a program to print the factorial of a number by defining a method named 'Factorial'.
public class Main {
    static int factorial(int num){
        if(num == 0 || num == 1){
            return 1;
        }
        if(num > 1){
            int sum  = 1;
            for(int i = 1 ; i <= num; i++){
                sum = sum * i;
            }
            return sum;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = in.nextInt();
        System.out.println(factorial(num));
    }
}

//10.Write a function to find if a number is a palindrome or not. Take number as a parameter.
public class Main {
    static String isPalindrome(int num){
        int originalValue = num;
        if(num <= 9){
            return "Not a palindrome";
        }
        if(num > 9){
            int reverse = 0;
            while(num !=0){
                int remainder = num % 10;
                reverse = reverse * 10 + remainder;
                num = num / 10;
            }
            if(reverse == originalValue){
                return "Palindrome";
            }
        }
        return "Not a palindrome";
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = in.nextInt();
        System.out.println(isPalindrome(num));
    }
}
