import java.time.LocalDate;

public class RegistrationOffice {

    public Student getAStudent() {
        Student s = null;

        int i = (int) (6 * Math.random());

        switch (i) {
            case 0:
                s = new Student(1,"Mert",2021, LocalDate.of(2001,12,06), "Computer Engineering");
                s.study();
                break;
            case 1:
                s = new VocationalStudent(2,"Ali",2019,LocalDate.of(2000,2,15),"Automotive Engineering");
                s.study();
                break;
            case 2:
                s = new UndergraduateStudent(3,"Jane",2020,LocalDate.of(2002,8,25),"Electrical Engineering","Mathematics");
                s.study();
                break;
            case 3:
                s = new GraduateStudent(4,"Can",2018,LocalDate.of(1998,5,10),"Computer Engineering","Dr.Ahmet","Artificial Intelligence");
                s.study();
                break;
            case 4:
                s = new MasterStudent(5,"Alice",2021,LocalDate.of(1997,2,14),"Biomedical Engineering","Dr.White","Cancer Research");
                s.study();
                break;
            case 5:
                s = new PhdStudent(6,"John",2020,LocalDate.of(1995,3,15),"Computer Science","Dr.Smith","Machine Learning",true);
                s.study();
                break;
        }
        return s;
    }

    public void registerStudent(Student student) {

        if (student instanceof Student) {
            student.register();
        } else if (student instanceof VocationalStudent) {
            student.register();
        } else if (student instanceof UndergraduateStudent) {
            student.register();
        } else if (student instanceof GraduateStudent) {
            student.register();
        } else if (student instanceof MasterStudent) {
            student.register();
        } else {
            student.register();
        }
    }
}
