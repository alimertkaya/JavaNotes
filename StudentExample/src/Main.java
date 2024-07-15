import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Student s = new Student(5,"Mert",2001, LocalDate.of(2020,9,15),"dal");
        VocationalStudent v = new VocationalStudent(6,"Ali",2020,LocalDate.of(2019,9,20),"yaprak");
        UndergraduateStudent u = new UndergraduateStudent(6,"Ali",2020,LocalDate.of(2019,9,20),"yaprak","dal");

        System.out.println(s.toString());
        System.out.println();
        System.out.println(v.toString());
        System.out.println();
        System.out.println(u.toString());
    }
}