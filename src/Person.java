/**
 * first class, Person. Basic user.
 */
public class Person {
    private String fName; //first name
    private String lName; //last name
    private String uName; //username

    public Person(String f, String l, String u) {
        fName = f;
        lName = l;
        uName = u;
    }

    public String getFirstName() {
        return fName;
    }
    public String getLastName() {
        return lName;
    }
    public String getUserName() {
        return uName;
    }
    public String toString() {
        return fName + " " + lName + " (" + uName + ")";
    }
}
