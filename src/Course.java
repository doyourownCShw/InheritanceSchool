import java.util.*;

/**
 * uses all other classes
 */

public class Course {
    private String title;
    private Professor professor;
    private TA headTA;
    private TA[] TAs;
    private ArrayList<Student> students; //because students must be added, use ArrayList

    public Course(String t, Professor p, TA hT, TA[] tA, ArrayList<Student> sT) {
        title = t;
        professor = p;
        headTA = hT;
        if (tA.length <= 15)
            TAs = tA;
        students = sT;
    }

    public String getTitle() {
        return title;
    }
    public Professor getProfessor() {
        return professor;
    }
    public TA getHeadTA() {
        return headTA;
    }
    public TA[] getTAs() {
        return TAs;
    }
    public ArrayList<Student> getStudents() {
        return students;
    }
    public void addStudent(Student s) {
        if (students.size() < 300) //limit course to 300 students
            students.add(s);
    }
}
