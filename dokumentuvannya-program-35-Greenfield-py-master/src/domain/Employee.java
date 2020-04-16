package domain;

/**
 * Class that is responsible for the output of information about employees
 * @author Stanislav
 */
public class Employee {
    
    /**
     * Method that output all information about employee
     * @return all information about employee
     */
    @Override
    public String toString() {
        return "\nEmployee ID= " + ID + "\nName= " + name + "\nJobTitle= " + jobTitle + "\nLevel= " + level + "\nDept= " + dept;
    }

    private String name;
    private String jobTitle;
    private int ID;
    private int level;
    private String dept;

   // private static int employeesCount = 0;
    
    /**
     * 
     * @param name
     * @param jobTitle
     * @param level
     * @param dept 
     */
    public Employee(String name, String jobTitle, int level, String dept) {
        this();
        setName(name);
        this.jobTitle = jobTitle;
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
        this.dept = dept;
    }
    
    /**
     * Method that generates random ID
     */
    public Employee() {
        ID = (int)(Math.random()*1000);
//        if (ID > 10000) {
//            throw new NumberFormatException("ERROR! Employee's ID cannot be greater than 10000. Employee is not created!");
//        }
    }
    
    /**
     * Method that sets job title
     * @param job 
     */
    public void setJobTitle(String job) {
        jobTitle = job;
    }
    
    /**
     * Method that return job title
     * @return job title
     */
    public String getJobTitle() {
        return jobTitle;
    }
    
    /**
     * Method that returns name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Method that set level value
     * @param level 
     */
    public void setLevel(int level) {
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
    }

    /**
     * This method returns level value
     * @return level
     */
    public int getLevel() {
        return level;
    }
    
    /**
     * This method returns department name
     * @return department name
     */
    public String getDept() {
        return dept;
    }
    
    /**
     * This method set the value for the department 
     * @param dept 
     */
    public void setDept(String dept) {
        this.dept = dept;
    }
    
    /**
     * This method checks if the string matches the regular expression
     * @param name 
     */
    public void setName(String name) {
//        boolean correctName = true;
//        for (int i = 0; i < name.length(); i++) {
//            char s = name.charAt(i);
//            if (Character.isDigit(s)) {
//                correctName = false;
//            }
//        }
//        if (correctName) {
//            this.name = name;
//        } else {
//            this.name = "John Doe";
//        }
        if (name.matches("^([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]*)+[ ]([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]+)+$")) {
            this.name = name;
        } else {
            this.name = "John Doe";
        }
    }
}
