import java.time.LocalDate;

public class PhdStudent extends GraduateStudent {
    private boolean qualifyingExamTaken;

    public PhdStudent(int no, String name, int year, LocalDate dob, String major, String advisor, String thesis, boolean qualifyingExamTaken) {
        super(no, name, year, dob, major, advisor, thesis);
        this.qualifyingExamTaken = qualifyingExamTaken;
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

    public void writePaper(String paperTitle) {
        System.out.printf("PhdStudent is writing a paper titled: %s\n", paperTitle);
    }
}
