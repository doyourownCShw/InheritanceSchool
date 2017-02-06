public class TA extends UndergradStudent {
    private double examScore;
    private double recitationScore;
    double officeHoursScore;

    public TA(String f, String l, String u, int sH, int nSH, int pizzaInitial, double eS, double rS, double oHS) {
        super(f,l,u,sH,nSH,pizzaInitial);
        if (eS >= 0 && eS <= 1)
            examScore = eS;
        else
            examScore = Math.random();
        if (rS >= 0 && rS <= 1)
            recitationScore = rS;
        else
            recitationScore = Math.random();
        if (oHS >= 0 && oHS <= 1)
            officeHoursScore = oHS;
        else
            officeHoursScore = Math.random();
    }

    public double getExamScore() {
        return examScore;
    }
    public double getRecitationScore() {
        return recitationScore;
    }
    public double getOfficeHoursScore() {
        return officeHoursScore;
    }

    public void setExamScore(double examScore) {
        if (examScore >= 0 && examScore <= 1)
            this.examScore = examScore;
        else
            this.examScore = Math.random();
    }
    public void setRecitationScore(double recitationScore) {
        if (recitationScore >= 0 && recitationScore <= 1)
            this.recitationScore = recitationScore;
        else
            this.recitationScore = Math.random();
    }
    public void setOfficeHoursScore(double officeHoursScore) {
        if (officeHoursScore >= 0 && officeHoursScore <= 1)
            this.officeHoursScore = officeHoursScore;
        else
            this.officeHoursScore = Math.random();
    }
}
