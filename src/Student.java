public class Student extends Person {
    private int studyHours;
    private int nonStudyHours;

    public Student(String f, String l, String u, int sH, int nSH) {
        super(f,l,u);
        if (sH >= 0)
            studyHours = sH;
        if (nSH >= 0)
            nonStudyHours = nSH;
    }

    public int getStudyHours() {
        return studyHours;
    }
    public int getNonStudyHours() {
        return nonStudyHours;
    }
    public double getStudyPercentage() {
        return (double)studyHours / (studyHours + nonStudyHours);
    }

    public void study(int hours) {
        if (hours >= 0)
            studyHours += hours;
    }
    public void relax(int hours) {
        if (hours >= 0)
            nonStudyHours += hours;
    }
}
