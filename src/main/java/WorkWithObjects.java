import model.Student;

public class WorkWithObjects {
    public static void main(String[] args) {
        Student niko = new Student();
        niko.setFirstName("Nikolajs");
        niko.setLastName("G.");
        niko.setEmail("mail@domain.com");
        niko.setAge(21);

        Student dasha = new Student();
        dasha.setFirstName("Darja");
        dasha.setLastName("A.");
        dasha.setEmail("mail2@domain.lv");
        dasha.setAge(18);

        Student lena = new Student("Helen", "N.", "mail3@domain.com");
//        lena.setAge(19);

//        System.out.println(niko.getFirstName() + " " + niko.getLastName());
//        System.out.println(dasha.getFirstName() + " " + dasha.getLastName());
//        System.out.println(niko.getFullName());
//        System.out.println(dasha.getFullName());
        niko.printFullInfo();
        dasha.printFullInfo();
        lena.printFullInfo();
    }
}
