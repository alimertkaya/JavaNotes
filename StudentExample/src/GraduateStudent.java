import java.time.LocalDate;

public class GraduateStudent extends Student {
    private String advisor;
    private String thesis;

    public GraduateStudent(int no, String name, int year, LocalDate dob, String major, String advisor, String thesis) {
        super(no, name, year, dob, major);
        this.advisor = advisor;
        this.thesis = thesis;
    }

    @Override
    public void study() {
        super.study();
    }

    @Override
    public void register() {
        super.register();
    }

    public void writeThesis() {
        String className = this.getClass().getSimpleName();
        System.out.printf("%s is writing thesis on %s\n",className,thesis);
    }

    public void meetWithAdvisor() {
        String className = this.getClass().getSimpleName();
        System.out.printf("%s is meeting with advisor %s\n",className,advisor);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
