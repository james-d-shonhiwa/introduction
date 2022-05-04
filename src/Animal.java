/**
 * This is a simple Java Bean Class
 * @author James Shonhiwa
 * @version 11
 */
public class Animal {
    String name;

    /**
     * Get name of animal
     * @return String
     */
    public String getName() {
        return name;
    }

    /**
     * Get name of animal
     * @param name - name of animal
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get name of animal
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Welcome");
    }
}
