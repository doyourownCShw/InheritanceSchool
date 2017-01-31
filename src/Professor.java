public class Professor extends Person {
    private double funnyFactor; //range [0,1]
    private double averageGPA;

    public Professor(String f, String l, String u, double fF, double aG) {
        super(f,l,u); //proper extension of Person
        if (fF >= 0 && fF <= 1) //check if within range
            funnyFactor = fF;
        else
            funnyFactor = 0.5; //default of 0.5
        if (aG >= 0 && aG <= 4) //check if within range
            averageGPA = aG;
        else
            averageGPA = 2.0; //default of 2.0
    }

    public double getFunnyFactor() {
        return averageGPA;
    }
    public double getAverageGPA() {
        return averageGPA;
    }
    public void setGPA(int gpa) {
        if (gpa >= 0 && gpa <= 4)
            averageGPA = gpa;
        else
            averageGPA = 2.0;
    }
    public void setFunnyFactor(int funnyFactor) {
        this.funnyFactor = funnyFactor;
    }

    public String toString() {
        return "Prof. " + super.toString() + " Average GPA: " + averageGPA + " Funny Factor: " + funnyFactor; //accesses the already-complete toString in Person
    }
}
