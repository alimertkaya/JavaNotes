import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Student s = new VocationalStudent(2,"Ali",2019,LocalDate.of(2000,2,15),"Automotive Engineering");
        GraduateStudent g = new PhdStudent(6,"John",2020,LocalDate.of(1995,3,15),"Computer Science","Dr.Smith","Machine Learning",true);

        s.study();
        s.register();
        g.study();
        g.register();
        g.meetWithAdvisor();

        RegistrationOffice r = new RegistrationOffice();
        Student student = r.getAStudent();
        System.out.println();
        r.registerStudent(student);
    }
}