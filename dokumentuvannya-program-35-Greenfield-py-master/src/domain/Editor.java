package domain;
/**
 * 
 * @author Stanislav
 */
public class Editor extends Artist {

    /**
     * This method has parameters
     * @param electronicEditing
     * @param skiils
     * @param name
     * @param jobTitle
     * @param level
     * @param dept 
     */
    public Editor(boolean electronicEditing, String[] skiils, String name, String jobTitle, int level, String dept) {
        super(skiils, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }
    /**
     * Method refers to these parameters
     * @param electronicEditing
     * @param skiils 
     */
    public Editor(boolean electronicEditing, String[] skiils) {
        super(skiils);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Method refers to this parameter
     * @param electronicEditing 
     */
    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }
    
    /**
     * this method gives the value true
     */
    public Editor() {
        super();
        this.electronicEditing = true;
    }

    /**
     * This method is responsible for what will be displayed in "Editing preferences"
     * @return editing preferences
     */
    @Override
    public String toString() {
        String s=super.toString()+"\nEditing preferences= "; 
        if (electronicEditing)
            s=s+"electronic";
        else
            s=s+"paper";
        return s;
            
    }

    private boolean electronicEditing;

    /**
     * This method returns editing preferences values
     * @return editing preferences
     */
    public boolean getPreferences() {
        return electronicEditing;
    }
    
    /**
     * This method set values for Editing preferences
     * @param electronic 
     */
    public void setPreferences(boolean electronic) {
        this.electronicEditing=electronic;
    }
}
