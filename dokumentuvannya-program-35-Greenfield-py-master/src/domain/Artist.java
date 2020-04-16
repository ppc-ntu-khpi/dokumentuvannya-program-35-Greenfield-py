package domain;
/**
 * 
 * @author Stanislav
 */
public class Artist extends Employee {

    /**
     * This method has parameters
     * @param skiils
     * @param name
     * @param jobTitle
     * @param level
     * @param dept 
     */
    public Artist(String[] skiils, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skiils = skiils;
    }

    /**
     * Method refers to these parameters
     * @param skiils 
     */
    public Artist(String[] skiils) {
        super();
        this.skiils = skiils;
    }
    
    /**
     * This method creates an instance
     */
    public Artist() {
        super();
        this.skiils = new String[10];
    }

    /**
     * Method returns skills values 
     * @return skills values 
     */
    @Override
    public String toString() {
        return super.toString()+"\nSkills: "+getSkills();
    }

    private String[] skiils;
    
    /**
     * Method to get skills values
     * @return skills values 
     */
    public String getSkills() {
        String s = "";
        for (String e : skiils) {
            s = s + e + ", ";
        }
       s=s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * This method set skills values 
     * @param skills 
     */
    public void setSkills(String[] skills) {
        this.skiils=skills;
    }
    
    /**
     * Method to get skill list values
     * @return skill list values
     */
    public String[] getSkillsLSist() {
        return skiils;
    }
}
