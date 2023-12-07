import java.util.*;
//1.Area of a circle

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of the circle : ");
        int r = in.nextInt();
        double area = 2 * 3.141 * r;
        System.out.print("Area of the circle is "+area);
    }
}

//2.Area of triangle

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base of triangle: ");
        int b = in.nextInt();
        System.out.print("Enter the height of the triangle: ");
        int h = in.nextInt();
        double area = 0.5 * b * h;
        System.out.print("Area of the triangle is "+area);
    }
}

//3.Area of rectangle

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of rectangle: ");
        int l = in.nextInt();
        System.out.print("Enter the breadth of the triangle: ");
        int b = in.nextInt();
        double area = l * b;
        System.out.print("Area of the rectangle is "+area);
    }
}

//4.Area Of Isosceles Triangle

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base of triangle: ");
        int b = in.nextInt();
        System.out.print("Enter the height of the triangle: ");
        int h = in.nextInt();
        double area = 0.5 * b * h;
        System.out.print("Area of the isosceles triangle is "+area);
    }
}

//5.Area Of Parallelogram
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base of parallelogram : ");
        int b = in.nextInt();
        System.out.print("Enter the height of the parallelogram: ");
        int h = in.nextInt();
        double area = b * h;
        System.out.print("Area of the isosceles triangle is " + area + " square units");
    }
}

//6.Area of Rhombus

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the diagonal 1 : ");
        int d1 = in.nextInt();
        System.out.print("Enter the diagonal 2 : ");
        int d2 = in.nextInt();
        double area = 0.5 * d1 * d2;
        System.out.print("Area of the rhombus is " + area );
    }
}

//7.Area Of Equilateral Triangle
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the side value: ");
        int a = in.nextInt();
        System.out.println(Math.sqrt(3));
        double area = Math.sqrt(3)*(a * a)/4;
        System.out.print("Area of the equilateral triangle is " + area );
    }
}

//8.Perimeter Of Circle
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        int r = in.nextInt();
        double perimeter = 2 * 3.141 * r;
        System.out.print("Perimeter of the circle is " + perimeter );
    }
}

//9.Perimeter Of Equilateral Triangle
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the sides : ");
        int a = in.nextInt();
        double perimeter = 3 * a;
        System.out.print("Perimeter of the equilateral triangle is " + perimeter );
    }
}

//10.Perimeter Of Parallelogram
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the sides : ");
        int a = in.nextInt();
        System.out.print("Enter the base: ");
        int b = in.nextInt();
        double perimeter = 2 * (a+b);
        System.out.print("Perimeter of the parallelogram is " + perimeter );
    }
}

//11.Perimeter Of Rectangle
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length : ");
        int l = in.nextInt();
        System.out.print("Enter the width : ");
        int w = in.nextInt();
        double perimeter = 2 * (l+w);
        System.out.print("Perimeter of the rectangle is " + perimeter );
    }
}

//12.Perimeter Of Square
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the side value : ");
        int a = in.nextInt();
        double perimeter = 4 * a;
        System.out.print("Perimeter of the square is " + perimeter );
    }
}

//13.Perimeter Of Rhombus
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the side value : ");
        int a = in.nextInt();
        double perimeter = 4 * a;
        System.out.print("Perimeter of the rhombus is " + perimeter );
    }
}

//14.Volume Of Cone Java Program
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        int r = in.nextInt();
        System.out.print("Enter the height : ");
        int h = in.nextInt();
        double volume = 1/3 * 3.141 * (r*r) * h;
        System.out.print("Volume of the cone is " + volume );
    }
}

//15.Volume of prism
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        int b = in.nextInt();
        System.out.print("Enter the height : ");
        int h = in.nextInt();
        double volume = b * h;
        System.out.print("Volume of the prism is " + volume );
    }
}

//16.Volume Of Cylinder
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        int r = in.nextInt();
        System.out.print("Enter the height : ");
        int h = in.nextInt();
        double volume = 3.141 * (r * r) * h;
        System.out.print("Volume of the prism is " + volume );
    }
}

//17.Volume Of Sphere
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        int r = in.nextInt();
        double volume = 4 * 3.141 * (r * r * r) / 3;
        System.out.print("Volume of the prism is " + volume );
    }
}

//18.Volume of pyramid
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        int r = in.nextInt();
        double volume = 4 * 3.141 * (r * r * r) / 3;
        System.out.print("Volume of the prism is " + volume );
    }
}

//19.Curved Surface Area Of Cylinder
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        int r = in.nextInt();
        System.out.print("Enter the height : ");
        int h = in.nextInt();
        double volume = 2 * 3.141 * r * h;
        System.out.print("Curved Surface Area Of Cylinder is " + volume );
    }
}

//20.Total Surface Area Of Cube
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        int r = in.nextInt();
        System.out.print("Enter the height : ");
        int h = in.nextInt();
        double volume = 2 * 3.141 * r * h;
        System.out.print("Curved Surface Area Of Cylinder is " + volume );
    }
}

//21.Fibonacci Series In Java Programs
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int a = 0, b = 1, c;

        if(number == 1) {
            System.out.print(a);
        }

        if(number > 1){
            System.out.print(a +" ");
            System.out.print(b +" ");
            for(int i = 2; i < number; i++){
                c = a + b;
                int temp = b;
                a = b;
                b = c;
                System.out.print(c + " ");
            }
        }
    }
}

//22.Subtract the Product and Sum of Digits of an Integer
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int remainder, product = 1, sum =0;
        while(number > 0)
        {
            remainder = number % 10;
            sum = sum + remainder;
            product = product * remainder;
            number = number / 10;
        }
        System.out.print(product-sum);
    }
}

//23.Input a number and print all the factors of that number (use loops).
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = in.nextInt();
        System.out.println("Factors of"+" "+number+" "+"is ");
        for(int i=1; i <= number; i++){
            if((number % i) == 0){
                System.out.print(i+ " ");
            }
        }
    }
}

//24.Take integer inputs till the user enters 0 and print the sum of all numbers

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 0 to exit");
        int number = 1;
        int sum =0;

        while(number != 0) {
            number = in.nextInt();
            sum = sum + number;
        }
        System.out.print(sum);
    }
}


//25.Take integer inputs till the user enters 0 and print the largest number from all.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 0 to exit");
        int number = 1, max = 0;
        int sum =0;

        while(number != 0) {
            number = in.nextInt();
            if(number > max)
                max = number;
            sum = sum + number;
        }
        System.out.print(max);
    }
}

//26.Addition Of Two Numbers
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1 = in.nextInt();
        System.out.print("Enter the first number : ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.print(sum);
    }
}