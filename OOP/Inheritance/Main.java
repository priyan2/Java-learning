
public class Main{
    static int Rollno = 14;//static
    int salary = 140;

    //constructor
//    public Main(int salary){
//        this.salary = salary; //this represents the current instance inside the method
//    }
    
    //constructor overloading 
//    public Main(int rollno , int salary){
//        this.Rollno = rollno;
//        this.salary = salary;
//    }
    static void fun(){
        System.out.println("This is a static method");
        //greetings(); Inside the static method non-static method can not be used
    }
    void greetings(){
        System.out.println("This is instance object");
        fun();//inside the non-static method static can be used.
    }

    //static block
    static int number1 = 1;
    static int number2;

//    static {
//        System.out.println("This is  a static block");
//        number2 = number1 + 2;
//    }

    // Main method
    public static void main(String[] args) {
//        System.out.println(Main.Rollno);
//        //Main obj = new Main(45);
//        //Main obj1 = new Main(45, 4500);
//        System.out.println(obj.salary);
//        System.out.println(obj1.salary);
//        obj.greetings();
//        fun();
//
//        Main stacticobj = new Main();
//        System.out.println(Main.number2 + " "+ Main.number1);

        Department dep = new Department(10000, 101, "Micky mouse", "Home");
        //System.out.println(dep.empdepartment);
        Department dep1 = new Department(dep);
        System.out.println(dep1.empname);
    }
}
