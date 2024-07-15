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
        System.out.println("GraduateStudent is studying");
    }

    @Override
    public void register() {
        System.out.println("GraduateStudent register");
    }

    public void writeThesis() {
        System.out.printf("GraduateStudent is writing thesis on %s\n", thesis);
    }

    public void meetWithAdvisor() {
        System.out.printf("GraduateStudent is meeting with advisor %s\n", advisor);
    }

    @Override
    public String toString() {
        return String.format("advisor= %s, thesis= %s", super.toString().replace("}",""),advisor,thesis);
    }
}
