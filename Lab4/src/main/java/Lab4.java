import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lab4 {
    public static void main(String[] args) {
        // Initialize an empty list of students
        List<Student> students = new ArrayList<Student>();

        // Add students to the list with random data
        students.add(new Student(1, "A", "Zane Spence", LocalDate.of(2002, 1, 12)));
        students.add(new Student(1, "B", "Chante Hawes", LocalDate.of(2001, 7, 23)));
        students.add(new Student(2, "A", "Wayne Pierce", LocalDate.of(2001, 1, 5)));
        students.add(new Student(2, "A", "Tyrone Hartley", LocalDate.of(2001, 9, 14)));
        students.add(new Student(3, "A", "Randy Wilde", LocalDate.of(2001, 1, 5)));
        students.add(new Student(3, "A", "Etta Patrick", LocalDate.of(2001, 9, 14)));

        // Date of birth should be in increasing order
        Comparator<Student> dobComparator = Comparator.comparing(Student::getDob);

        // Course should be in decreasing order
        Comparator<Student> courseComparator = Comparator.comparing(Student::getCourse).reversed();

        students.sort(dobComparator);
        students.sort(courseComparator);

        for (Student student: students) {
            System.out.println(student);
        }
    }
}
