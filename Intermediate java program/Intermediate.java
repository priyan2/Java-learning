import java.util.*;

//1.Factorial Program In Java
public class Intermediate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = in.nextInt();

        int factorial = 1;
        if((number == 0) || (number == 1)){
            System.out.print(factorial);
        }
        if(number > 1){
            for(int i = 1; i <= number; i++){
                factorial = factorial * i;
            }
            System.out.println(factorial);
        }
    }
}

//2.Calculate Electricity Bill
public class Intermediate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of units : ");
        int units = in.nextInt();
        double amount = 0;

        if(units <= 100){
            //upto 100 units govt subsidary
            System.out.println("Amount to be paid : " + amount);
        }

        if(units >= 101 && units <= 400){
            units = units - 100;
            amount = units * 4.50;
            System.out.print("Amount to be paid : "+ amount);
        }

        if(units >= 401 && units <= 500){
            units = units - 100;
            amount = units * 8;
            System.out.println("Amount to be paid : "+amount);
        }
    }
}

//3.Calculate Average Of N Numbers
public class Intermediate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = in.nextInt();
        int sum = 0, average = 0, count = 0;
        for(int i = 1; i <= number; i++){
            sum = sum + i;
        }
        System.out.println("Average is "+ sum / number);
    }
}

//4.Calculate Discount Of Product
public class Intermediate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the original price of the item : ");
        int original = in.nextInt();
        System.out.println("Enter the discount percentage: ");
        int discountPercentage = in.nextInt();
        double discountedRate = original * discountPercentage / 100;
        System.out.println("Price after discount : ");
        System.out.println(original-discountedRate);

    }
}

//5.Calculate Distance Between Two Points
public class Intermediate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of x1: ");
        int x1 = in.nextInt();
        System.out.println("Enter the value of x2: ");
        int x2 = in.nextInt();
        System.out.println("Enter the value of y1: ");
        int y1 = in.nextInt();
        System.out.println("Enter the value of y2: ");
        int y2 = in.nextInt();
        double distanceBtwPoints = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        System.out.println(distanceBtwPoints);
    }
}

//6.Calculate Commission Percentage
public class Intermediate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the original amount : ");
        int originalAmount = in.nextInt();
        System.out.println("Enter the discount amount: ");
        double commissionAmount = in.nextInt();

        double percentage = (commissionAmount / originalAmount) * 100;
        System.out.println("Commision percentage is :" + percentage);
    }

//7.Power In Java
public class intermediate {
    public static void main(string[] args) {
        scanner in = new scanner(system.in);
        system.out.println("enter the number: ");
        int number = in.nextint();
        system.out.println("enter the power value");
        int power = in.nextint();
        int result = 1;
        for(int count = power;count != 0; count--){
            result= result * number;
        }
        system.out.println(result);
    }

//8.Calculate Depreciation of Value
public class Intermediate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = in.nextInt();
        System.out.println("Enter the power value");
        int power = in.nextInt();
        int result = 1;
        for(int count = power;count != 0; count--){
            result= result * number;
        }
        System.out.println(result);
    }
}
