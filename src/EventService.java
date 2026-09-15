import java.util.ArrayList;

public class EventService {

    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Event> events = new ArrayList<>();
    private ArrayList<Registration> registrations = new ArrayList<>();

    // methods...

    // Add Event
    public void addEvent(Event event) {
        events.add(event);
        System.out.println("Event added successfully!\n");
    }

    // Display Events
    public void showEvents() {

        if (events.isEmpty()) {
            System.out.println("No events available.\n");
            return;
        }

        System.out.println("===== AVAILABLE EVENTS =====");

        for (Event e : events) {
            System.out.println(e);
        }

    }

    // Get Total Events
    public int getTotalEvents() {
        return events.size();
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully!\n");
    }

    public void showStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.\n");
            return;
        }
        System.out.println("===== AVAILABLE STUDENTS =====");

        for (Student s : students) {
            System.out.println("Student ID   : " + s.getStudentId());
            System.out.println("Name         : " + s.getStudentName());
            System.out.println("Email        : " + s.getStudentEmail());
            System.out.println("Department   : " + s.getDepartment());
            System.out.println("----------------------------");
        }
    }
}