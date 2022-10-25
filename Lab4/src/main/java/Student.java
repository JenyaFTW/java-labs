import java.time.LocalDate;

public class Student {
    // Student course
    private Integer course;

    // Group identifier
    public String group;

    // First name
    public String firstName;

    // Last name
    public String lastName;

    // Date of birth
    private LocalDate dateOfBirth;

    public LocalDate getDob() {
        return this.dateOfBirth;
    }

    public Integer getCourse() {
        return this.course;
    }

    public String toString() {
        return String.format("%d | %s | %s | %s | %s", course, group, firstName, lastName, dateOfBirth);
    }

    public Student(Integer course, String group, String fullName, LocalDate dateOfBirth) {
        this.course = course;
        this.group = group;
        this.dateOfBirth = dateOfBirth;

        // Split full name with max 2 items (first and last)
        String[] splitName = fullName.split(" ", 2);
        this.firstName = splitName[0];
        this.lastName = splitName[1];
    }
}
