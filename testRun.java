/**
 * is this code messy? yeah. are there aspects that could be streamlined? definitely. does it do what the client specified? oh yeah it does.
 */

import java.util.*;

public class testRun {
    public static void main(String[] args) {
        Student s1 = new Student("Jarod", "Schneider", "jmschneider-17",2,12);
        Student s2 = new Student("Reese", "Howard", "srhoward-17", 7, 4);
        Student s3 = new Student("Sophie", "Chapar", "smchapar-17", 2,10);

        Professor p1 = new Professor("Donald", "Trump", "realDonaldTrump", 0.5, 3.6);

        GradStudent g1 = new GradStudent("Robert", "Smith", "rsmith", 10);
        UndergradStudent u1 = new UndergradStudent("Cynthia", "Robertson", "crobertson",5,4);
        TA t1 = new TA("Dan", "Potter", "dpotter", 10,3,0.35, 0.65, 0.45);

        ArrayList<Student> sTs = new ArrayList<Student>();
        sTs.add(s1);
        sTs.add(s2);
        sTs.add(s3);
        sTs.add(g1);
        sTs.add(u1);

        System.out.println("List of students (FIRST LAST USER STUDY RELAX PERCENT):");
        for (Student s : sTs) {
            System.out.println(s.getFirstName() + " | " + s.getLastName() + " | " + s.getUserName() + " | " + s.getStudyHours() + " | " + s.getNonStudyHours() + " | " + s.getStudyPercentage());
        }

        System.out.println("Each student will now study for 3 hours and relax for 2.\nNew List of students (same format):");
        for (Student s : sTs) {
            s.study(3);
            s.relax(2);
            System.out.println(s.getFirstName() + " | " + s.getLastName() + " | " + s.getUserName() + " | " + s.getStudyHours() + " | " + s.getNonStudyHours() + " | " + s.getStudyPercentage());
        }

        System.out.println("Cynthia's hope: " + u1.getHope());
        u1.eatPizza(3);
        System.out.println("Cynthia's consumed pizzas: " + u1.getPizza());
        u1.loseHope(10);
        System.out.println("Cynthia took a test and now only has " + u1.getHope() + " hope left :(");

        System.out.println("Profile of Prof. " + p1.getLastName() + ": " + "AVERAGE GPA = " + p1.getAverageGPA() + " FUNNY FACTOR = " + p1.getFunnyFactor());
        System.out.println("Prof. " + p1.getLastName() + " gave a pop quiz....");
        p1.setFunnyFactor(0.3);
        p1.setGPA(3.1);
        System.out.println("His class's average GPA is now only " + p1.getAverageGPA() + " and his funny score is now " + p1.getFunnyFactor() + ". His students aren't laughing anymore....");

        TA t2 = new TA("Bob", "The TA", "TA2",6,4,0.65,0.52,0.54);
        TA t3 = new TA("John", "The TA", "TA3",7,3,0.35,0.15,0.75);
        TA t4 = new TA("Jane", "The TA", "TA4",10,0,0.85,0.41,0.71);
        TA t5 = new TA("Tom", "The TA", "TA5",4,3,0.15,0.85,0.73);
        TA t6 = new TA("Robert", "The TA", "TA6",12,7,0.85,0.75,0.65);
        TA t7 = new TA("Sally", "The TA", "TA7",7,3,0.35,0.15,0.75);
        TA t8 = new TA("Elizabeth", "The TA", "TA8",7,3,0.35,0.15,0.75);
        TA t9 = new TA("Phil", "The TA", "TA9",9,3,0.51,0.95,1);
        TA t10 = new TA("Yolo", "The TA", "TA10",4,1,0.01,0.02,0.03);
        TA t11 = new TA("Harry", "The TA", "TA11",7,3,0.78,0.15,0.25);
        TA t12 = new TA("Jacob", "The TA", "TA12",11,4,0.35,0.15,0.75);
        TA t13 = new TA("Linda", "The TA", "TA13",7,3,0.35,0.25,0.75);
        TA t14 = new TA("Mary", "The TA", "TA14",13,7,0.21,0.65,0.55);
        TA t15 = new TA("Susan", "The TA", "TA15",10,3,0.65,0.85,0.99);
        TA t16 = new TA("Ruth", "The TA", "TA16",8,3,0.57,0.68,0.69);
        TA[] tAs = {t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16};

        System.out.println("List of TAs (FIRST LAST USER STUDY RELAX EXAM RECITATION OFFICE.HOURS):");
        for (TA t : tAs) {
            System.out.println(t.getFirstName() + " | " + t.getLastName() + " | " + t.getUserName() + " | " + t.getStudyHours() + " | " + t.getNonStudyHours() + " | " + t.getExamScore() + " | " + t.getRecitationScore() + " | " + t.getOfficeHoursScore());
        }

        System.out.println("The TAs have done some work...\nNew TA list (same format):");
        for (TA t : tAs) {
            t.setExamScore(Math.random());
            t.setRecitationScore(Math.random());
            t.setOfficeHoursScore(Math.random());
            System.out.println(t.getFirstName() + " | " + t.getLastName() + " | " + t.getUserName() + " | " + t.getStudyHours() + " | " + t.getNonStudyHours() + " | " + t.getExamScore() + " | " + t.getRecitationScore() + " | " + t.getOfficeHoursScore());
        }

        Course c1 = new Course("Political Science Fiction", p1, t1, tAs, sTs);

        System.out.println("Course Profile (TITLE PROF. HEAD.TA NUM.TAs NUM.STUDENTS AVG.STUDY.PERCENT): " + c1.getTitle() + " | " + c1.getProfessor().getLastName() + " | " + c1.getHeadTA().getLastName() + " | " + c1.getTAs().length + " | " + c1.getStudents().size() + " | " + c1.getAverageStudyPercentage());

        Student s45 = new Student("Stephen", "Bannon", "#fakenews", 0,88);
        c1.addStudent(s45);
        System.out.println("OH, no! A new student has joined the class: " + s45.getFirstName() + " " + s45.getLastName());
        System.out.println("New course average study percentage: " + c1.getAverageStudyPercentage());
    }
}
