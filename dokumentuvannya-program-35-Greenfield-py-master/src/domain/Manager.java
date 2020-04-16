package domain;

/**
 * Class class with manager information
 * @author Stanislav
 */
public class Manager extends Employee {

    /**
     * 
     * @param employees
     * @param name
     * @param jobTitle
     * @param level
     * @param dept 
     */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }

    /**
     * That method returns names employees of this department
     * @return names employees
     */
    @Override
    public String toString() {
        return super.toString()+"\nEmployees: "+getEmployees(); 
    }
    
    /**
     * 
     * @param employees 
     */
    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }
    
    /**
     * This method creates an instance
     */
    public Manager() {
        super();
        employees = new Employee[10];
    }

    private Employee[] employees;

    /**
     * The method in which the employee gets the value
     * @return employee value
     */
    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s=s.substring(0, s.length() - 2);
        return s;
    }
    
    /**
     * Method sets parameters for employees
     * @param employees 
     */
    public void setEmployees(Employee[] employees) {
        this.employees=employees;
    }

    /**
     * Method returns employees value
     * @return employees value
     */
    public Employee[] getEmployeesList() {
        return employees;
    }

    
}
