public class Student extends Person {
    private int studyHours;
    private int nonStudyHours;

    public Student(String f, String l, String u, int sH, int nSH) {
        super(f,l,u);
        if (sH >= 0)
            studyHours = sH;
        else
            studyHours = (int)(Math.random() * 30); //random, max 30
        if (nSH >= 0)
            nonStudyHours = nSH;
        else
            nonStudyHours = (int)(Math.random() * 30); //random, max 30
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
