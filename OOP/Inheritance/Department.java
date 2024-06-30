public class Department extends Employee{
    String empdepartment;

    public Department(int salary, int empid, String empname, String empdepartment) {
        super(salary, empid, empname);
        this.empdepartment = empdepartment;
    }

}
