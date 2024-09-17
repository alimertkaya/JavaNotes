import java.time.LocalDate;

import static java.lang.StringTemplate.STR;

public abstract class AbstractStudent {
    private int no;
    private String name;
    private int year;
    private LocalDate dob;
    private String major;
    public AbstractStudent(int no, String name, int year, LocalDate dob, String major) {
        this.no = no;
        this.name = name;
        this.year = year;
        this.dob = dob;
        this.major = major;
    }

    public String toString() {
        String className = this.getClass().getSimpleName();
        return STR."\{className}: no= \{no}, name= \{name}, year= \{year}, date= \{dob}, major= \{major}";
    }
}
