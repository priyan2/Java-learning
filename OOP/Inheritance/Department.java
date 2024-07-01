public class Department extends Employee{
    String empdepartment;


    public Department(int salary, int empid, String empname, String empdepartment) {
        super(salary, empid, empname);
        this.empdepartment = empdepartment;

    }

        public Department(Department old){
        super(old.salary, old.empid, old.empname);
        this.empdepartment = old.empname;
    }
}
