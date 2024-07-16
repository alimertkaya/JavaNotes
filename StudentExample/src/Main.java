import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Student s = new VocationalStudent(2,"Ali",2019,LocalDate.of(2000,2,15),"Automotive Engineering");
        GraduateStudent g = new PhdStudent(6,"John",2020,LocalDate.of(1995,3,15),"Computer Science","Dr.Smith","Machine Learning",true);

        s.study();
        g.study();
        g.meetWithAdvisor();
        System.out.println();

        RegistrationOffice r = new RegistrationOffice();
        Student student = r.getAStudent();
        student.register();
        System.out.println(student.toString());

        if (student instanceof GraduateStudent) {
            ((GraduateStudent) student).meetWithAdvisor();
            ((GraduateStudent) student).writeThesis();
        } else if (student instanceof MasterStudent) {
            MasterStudent masterStudent = (MasterStudent) student;
            masterStudent.meetWithAdvisor();
            masterStudent.writeThesis();
        } else if (student instanceof PhdStudent){
            PhdStudent phdStudent = (PhdStudent) student;
            phdStudent.meetWithAdvisor();
            phdStudent.writeThesis();
            phdStudent.writePaper("Machine learning");
        }
    }
}