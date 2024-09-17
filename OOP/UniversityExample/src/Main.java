public class Main {

    public static void main(String[] args) {
        Department department1 = new Department();
        department1.name = "Software Engineering";

        Professor professor1 = new Professor();
        professor1.name = "Hamza Erol";

        Course course1 = new Course();
        course1.name = "Int. to Software Engineering";

        Student student1 = new Student();
        student1.name = "Mert Kaya";

        Classroom classroom1 = new Classroom();
        classroom1.no = "304";

        // Head of Software Engineering department is Hamza Arslan and consequently his department is Software Engineering.
        department1.head = professor1;
        professor1.department = department1;

        // Department of Int. to Software Engineering course is Software Engineering and consequently the course
        // Int. to Software Engineering belongs to Software Engineering department.
        course1.department = department1;
        department1.courses = new Course[100];
        department1.courses[0] = course1;

        course1.teacher = professor1;
        professor1.coursesGiven = new Course[5];
        professor1.coursesGiven[0] = course1;

        professor1.advisee = new Student[10];
        professor1.advisee[0] = student1;
        student1.advisor = professor1;

        student1.coursesTaken = new Course[7];
        student1.coursesTaken[0] = course1;

        course1.students = new Student[100];
        course1.students[0] = student1;

        classroom1.courses = new Course[15];
        classroom1.courses[0] = course1;
        course1.classroom = classroom1;
        
        System.out.println("Name of student student1's first course is " + student1.coursesTaken[0].name);
        System.out.println("Name of student student1's first course's professor is " + student1.coursesTaken[0].teacher.name);
        System.out.println("Name of student student1's first course's professor's department is " + student1.coursesTaken[0].teacher.department.name);
        System.out.println("Name of student student1's first course's classroom is " + student1.coursesTaken[0].classroom.no);
    }
}