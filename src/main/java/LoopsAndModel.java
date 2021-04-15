import model.Course;
import model.Student;
import model.enums.CourseName;

import java.util.List;

public class LoopsAndModel {
    public static void main(String[] args){
        Course java = new Course(CourseName.JAVA, 15);

        System.out.println("This course is: " + java.getName());

        java.addStudent(new Student("Darja", "Ag.", "dasha@inbox.lv"));
        java.addStudent(new Student("Niko", "Gr.", "nik@inbox.lv"));
        java.addStudent(new Student("Nata", "Noname", "nata@inbox.lv"));
        java.addStudent(new Student("Kara", "Ko.", "ko@inbox.lv"));
        java.addStudent(new Student("Jurij", "Te.", "jura@inbox.lv"));

//        System.out.println(java.getStudents().size());
//        System.out.println(java.getStudents().get(1).getFirstName());
        List<Student> students = java.getStudents();

        //regular for:
        for (int i = 0; i < students.size(); i++){
            System.out.println(students.get(i).getFullName());
        }

        System.out.println("---");

        //for each:
        for (Student s : students) {
//            System.out.println(s.getFullName());

            //if:
            if (s.getFirstName().startsWith("N")){
                System.out.println(s.getFullName());
            }
            else {
                System.out.println("This name isn't started from N!");
            }

            //alternative, weird if:
            System.out.println(s.getFirstName().startsWith("N") ? s.getFullName() : "This name isn't started from N!");
        }

        System.out.println("===");

        boolean isNatalyFound = false;

        //while:
        while (!isNatalyFound){
            for (Student s : students) {
                System.out.println(s.getFirstName());
                if (s.getFirstName().equals("Nata")) {
                    System.out.println(s.getFullName());
                    isNatalyFound = true;
                    break;
                }
            }
        }
    }
}
