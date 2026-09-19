import java.util.ArrayList;

public class EventService {

    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Event> events = new ArrayList<>();
    private ArrayList<Registration> registrations = new ArrayList<>();

    // ================= STUDENT MANAGEMENT =================

    // Add Student
    public void addStudent(Student student) {

        for (Student s : students) {

            if (s.getStudentId().equals(student.getStudentId())) {
                System.out.println("Student ID already exists!\n");
                return;
            }
        }

        students.add(student);
        System.out.println("Student added successfully!\n");
    }

    // Remove Student
    public void removeStudent(String studentId) {

        for (int i = 0; i < students.size(); i++) {

            if (students.get(i).getStudentId().equals(studentId)) {

                students.remove(i);
                System.out.println("Student removed successfully!\n");
                return;
            }
        }

        System.out.println("Student not found!\n");
    }

    // Find Student
    public Student findStudent(String studentId) {

        for (Student s : students) {

            if (s.getStudentId().equals(studentId)) {
                return s;
            }
        }

        return null;
    }

    // Display Students
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


    // ================= EVENT MANAGEMENT =================

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

    // Find Event
    public Event findEvent(String eventId) {

        for (Event e : events) {

            if (e.getEventId().equals(eventId)) {
                return e;
            }
        }

        return null;
    }

    // Remove Event
    public void removeEvent(String eventId) {

        for (int i = 0; i < events.size(); i++) {

            if (events.get(i).getEventId().equals(eventId)) {

                events.remove(i);
                System.out.println("Event removed successfully!\n");
                return;
            }
        }

        System.out.println("Event not found!\n");
    }


    // ================= REGISTRATION =================

    // Register Student
    // Register Student
public void registerStudent(String registrationId,
                            String studentId,
                            String eventId,
                            String registrationDate) {

    Student student = findStudent(studentId);
    Event event = findEvent(eventId);

    if (student == null) {
        System.out.println("Student not found!\n");
        return;
    }

    if (event == null) {
        System.out.println("Event not found!\n");
        return;
    }

    // Check duplicate registration
    for (Registration r : registrations) {

        if (r.getStudent().getStudentId().equals(studentId)
                && r.getEvent().getEventId().equals(eventId)) {

            System.out.println(
                    "Student is already registered for this event!\n"
            );

            return;
        }
    }

    // Check event capacity
    int count = 0;

    for (Registration r : registrations) {

        if (r.getEvent().getEventId().equals(eventId)) {
            count++;
        }
    }

    if (count >= event.getCapacity()) {
        System.out.println(
                "Event is full! No more registrations allowed.\n"
        );
        return;
    }

    // Create registration
    Registration registration = new Registration(
            registrationId,
            student,
            event,
            registrationDate
    );

    registrations.add(registration);

    System.out.println("Student registered successfully!\n");
}
    public void showRegistrations() {

    if (registrations.isEmpty()) {
        System.out.println("No registrations available!\n");
        return;
    }

    System.out.println("===== ALL REGISTRATIONS =====");

    for (Registration r : registrations) {

        System.out.println("Registration ID : " + r.getRegistrationId());
        System.out.println("Student ID      : " + r.getStudent().getStudentId());
        System.out.println("Student Name    : " + r.getStudent().getStudentName());
        System.out.println("Event ID        : " + r.getEvent().getEventId());
        System.out.println("Event Name      : " + r.getEvent().getEventName());
        System.out.println("Registration Date : " + r.getRegistrationDate());
        System.out.println("----------------------------");
    }
}
}