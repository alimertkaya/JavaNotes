import java.time.LocalDate;

public abstract class Student {
    private int no;
    private String name;
    private int year;
    private LocalDate dob;
    private String major;
    public Student(int no, String name, int year, LocalDate dob, String major) {
        this.no = no;
        this.name = name;
        this.year = year;
        this.dob = dob;
        this.major = major;
    }
    public abstract void study();
    public abstract void register();

    public String toString() {
        String className = this.getClass().getSimpleName();
        return STR."\{className}: no= \{no}, name= \{name}, year= \{year}, date= \{dob}, major= \{major}";
    }
}
