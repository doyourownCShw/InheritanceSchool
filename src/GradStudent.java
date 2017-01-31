public class GradStudent extends Student {
    public GradStudent(String f, String l, String u, int sH) {
        super(f,l,u,sH,0); //forces non-study hours to 0
    }

    public void relax(int hours) {
        System.out.println("NO RELAX. STUDY."); //override relax method to enforce no relaxing rule
    }
}
