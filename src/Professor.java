public class Professor extends Person {
    private double funnyFactor; //range [0,1]
    private double averageGPA;

    public Professor(String f, String l, String u, double fF, double aG) {
        super(f,l,u); //proper extension of Person
        if (fF >= 0 && fF <= 1) //check if within range
            funnyFactor = fF;
        else
            funnyFactor = Math.random();
        if (aG >= 0 && aG <= 4) //check if within range
            averageGPA = aG;
        else
            averageGPA = Math.random() * 4; //aG fell outside requirements, random GPA
    }

    public double getFunnyFactor() {
        return funnyFactor;
    }
    public double getAverageGPA() {
        return averageGPA;
    }
    public void setGPA(double gpa) {
        if (gpa >= 0 && gpa <= 4)
            averageGPA = gpa;
    }
    public void setFunnyFactor(double funnyFactor) {
        if (funnyFactor >= 0 && funnyFactor <= 1)
            this.funnyFactor = funnyFactor;
    }
}
