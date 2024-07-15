import java.time.LocalDate;

public class UndergraduateStudent extends Student {
    public String minor;
    public UndergraduateStudent(int no, String name, int year, LocalDate dob, String major, String minor) {
        super(no, name, year, dob, major);
        this.minor = minor;
    }

    @Override
    public void study() {
        System.out.println("UndergraduateStudent is studying");
    }

    @Override
    public void register() {
        System.out.println("UndergraduateStudent register");
    }

    @Override
    public String toString() {
        return String.format("%s, minor= %s", super.toString().replace("}", ""),minor);
    }
}
