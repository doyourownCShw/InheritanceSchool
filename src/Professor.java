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
            averageGPA = Math.random() * 4;
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
            averageGPA = Math.random() * 4;
    }
    public void setFunnyFactor(int funnyFactor) {
        if (funnyFactor >= 0 && funnyFactor <= 1)
            this.funnyFactor = funnyFactor;
        else
            this.funnyFactor = Math.random();
    }
}
