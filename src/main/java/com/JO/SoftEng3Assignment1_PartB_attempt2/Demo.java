package com.JO.SoftEng3Assignment1_PartB_attempt2;
import com.JO.SoftEng3Assignment1.Course;
import com.JO.SoftEng3Assignment1.Module;
import com.JO.SoftEng3Assignment1.Student;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        Student s1 = new Student("Melony", 18, "17/04/1998", "147");
        Student s2 = new Student("Dan", 22, "23/09/1995", "182");
        Student s3 = new Student("Mallisa", 20, "09/01/1997", "47");
        Student s4 = new Student("Cruz", 21, "10/02/1997", "267");
        Student s5 = new Student("Angelica", 21, "15/08/1996", "81");
        Student s6 = new Student("Stephan", 258, "19/07/1758", "125");

        //ALL STUDENTS LIST
        List<Student> slAll = new ArrayList<Student>();
        slAll.add(s2);
        slAll.add(s1);
        slAll.add(s3);
        slAll.add(s4);
        slAll.add(s5);
        slAll.add(s6);

        //STUDENT LIST #1
        List<Student> sl1 = new ArrayList<Student>();
        sl1.add(s2);
        sl1.add(s1);

        //STUDENT LIST #2
        List<Student> sl2 = new ArrayList<Student>();
        sl2.add(s3);
        sl2.add(s4);
        sl2.add(s5);
        sl2.add(s6);

        //CREATING SOME MODULES
        Module m1 = new Module("Machine Learning", "CT475", sl1);
        Module m2 = new Module("MIM", "CT412", sl2);

        //MODULE LIST #1
        List<Module> ml1 = new ArrayList<Module>();
        ml1.add(m1);
        ml1.add(m2);

        //CREATING A COURSE
        Course c1 = new Course("Computer Science", ml1, "04/09/2017", "28/04/2017");

        //COURSE LIST #1
        List<Course> cl1 = new ArrayList<Course>();
        cl1.add(c1);

        for (Course c : cl1) {
            System.out.println(c.getCourseName() + " ");
            for (Module m : c.getModuleList()) { // for each module in course c
                System.out.print("\t" + m.getModCode() + "-" + m.getModName());
                System.out.print("\n\t\tSTUDENTS IN MODULE: ");
                for (Student s : m.getStudentList()) {
                    System.out.print(s.getName() + " ");
                }
                System.out.println("\n");
            }
        }
    }
}

