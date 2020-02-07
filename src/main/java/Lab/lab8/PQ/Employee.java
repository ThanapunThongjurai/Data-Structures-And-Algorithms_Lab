package Lab.lab8.PQ;

public class Employee implements Comparable {

    private String empId;
    private String firstName;
    private String lastName;
    private int department;
    private int salary;

    @Override
    public int compareTo(Object o) {
        Employee otherobj = (Employee) o;
        if (this.salary > otherobj.salary) {
            return 1;
        }
        if (this.salary < otherobj.salary) {
            return -1;
        }
        return 0;
    }

    public Employee(String empId, String firstName, String lastName, int department, int salary) {
        this.empId = empId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
