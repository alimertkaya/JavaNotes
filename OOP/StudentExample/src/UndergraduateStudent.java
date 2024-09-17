import java.time.LocalDate;

public class UndergraduateStudent extends Student {
    public String minor;
    public UndergraduateStudent(int no, String name, int year, LocalDate dob, String major, String minor) {
        super(no, name, year, dob, major);
        this.minor = minor;
    }

    @Override
    public void study() {
        super.study();
    }

    @Override
    public void register() {
        super.register();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
