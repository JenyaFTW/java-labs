import java.time.LocalDate;

public class Student {
    // Student course
    public Integer course;

    // Group identifier
    public String group;

    // First name
    public String firstName;

    // Last name
    public String lastName;

    // Date of birth
    public LocalDate dateOfBirth;

    public void display() {
        String displayString = String.format("%d | %s | %s | %s | %s", course, group, firstName, lastName, dateOfBirth);
        System.out.println(displayString);
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
