import java.time.LocalDate;

public class VocationalStudent extends Student {

    public VocationalStudent(int no, String name, int year, LocalDate dob, String major) {
        super(no, name, year, dob, major);
    }

    @Override
    public void study() {
        System.out.println("VocationalStudent is studying\n");
    }

    @Override
    public void register() {
        System.out.println("VocationalStudent register\n");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
