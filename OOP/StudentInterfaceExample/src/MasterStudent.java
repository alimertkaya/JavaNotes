import java.time.LocalDate;

public class MasterStudent extends GraduateStudent {

    public MasterStudent(int no, String name, int year, LocalDate dob, String major, String advisor, String thesis) {
        super(no, name, year, dob, major, advisor, thesis);
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
    public void writeThesis() {
        super.writeThesis();
    }

    @Override
    public void meetWithAdvisor() {
        super.meetWithAdvisor();
    }

}
