import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EventService service = new EventService();

        int choice;

        do {

            System.out.println("\n===== COLLEGE EVENT MANAGEMENT =====");
            System.out.println("1. Add Event");
            System.out.println("2. View Events");
            System.out.println("3. Total Events");
            System.out.println("4. Add Student");
            System.out.println("5. View Students");
            System.out.println("6. Remove Student");
            System.out.println("7. Find Student");
            System.out.println("8. Remove Event");
           System.out.println("9. Find Event");
            System.out.println("10. Register Student");
System.out.println("11. View Registrations");
System.out.println("12. Exit");
             System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Event ID: ");
                    String id = sc.nextLine();

                    System.out.print("Event Name: ");
                    String name = sc.nextLine();

                    System.out.print("Date: ");
                    String date = sc.nextLine();

                    System.out.print("Venue: ");
                    String venue = sc.nextLine();

                    System.out.print("Category: ");
                    String category = sc.nextLine();

                    System.out.print("Capacity: ");
                    int capacity = sc.nextInt();
                    sc.nextLine();

                    Event event = new Event(
                            id,
                            name,
                            date,
                            venue,
                            category,
                            capacity
                    );

                    service.addEvent(event);

                    break;

                case 2:

                    service.showEvents();

                    break;

                case 3:

                    System.out.println(
                            "Total Events: " + service.getTotalEvents()
                    );

                    break;

                case 4:

                    System.out.print("Student ID: ");
                    String studentId = sc.nextLine();

                    System.out.print("Student Name: ");
                    String studentName = sc.nextLine();

                    System.out.print("Student Email: ");
                    String studentEmail = sc.nextLine();

                    System.out.print("Department: ");
                    String department = sc.nextLine();

                    Student student = new Student(
                            studentId,
                            studentName,
                            studentEmail,
                            department
                    );

                    service.addStudent(student);

                    break;

                case 5:

                    service.showStudents();

                    break;

                case 6:

                    System.out.print("Enter Student ID to remove: ");
                    String removeStudentId = sc.nextLine();

                    service.removeStudent(removeStudentId);

                    break;

                case 7:

                    System.out.print("Enter Student ID to find: ");
                    String findStudentId = sc.nextLine();

                    Student foundStudent = service.findStudent(findStudentId);

                    if (foundStudent != null) {
                        System.out.println("\nStudent Found!");
                        System.out.println("Student ID : " + foundStudent.getStudentId());
                        System.out.println("Name       : " + foundStudent.getStudentName());
                        System.out.println("Email      : " + foundStudent.getStudentEmail());
                        System.out.println("Department : " + foundStudent.getDepartment());
                    } else {
                        System.out.println("Student not found!");
                    }

                    break;

                case 8:

                    System.out.print("Enter Event ID to remove: ");
                    String removeEventId = sc.nextLine();

                    service.removeEvent(removeEventId);

                    break;

                case 9:

                    System.out.print("Enter Event ID to find: ");
                    String findEventId = sc.nextLine();

                    Event foundEvent = service.findEvent(findEventId);

                    if (foundEvent != null) {
                        System.out.println("\nEvent Found!");
                        System.out.println(foundEvent);
                    } else {
                        System.out.println("Event not found!");
                    }

                    break;
                case 10:

    System.out.print("Registration ID: ");
    String registrationId = sc.nextLine();

    System.out.print("Student ID: ");
    String registerStudentId = sc.nextLine();

    System.out.print("Event ID: ");
    String registerEventId = sc.nextLine();

    System.out.print("Registration Date: ");
    String registrationDate = sc.nextLine();

    service.registerStudent(
            registrationId,
            registerStudentId,
            registerEventId,
            registrationDate
    );

    break;   
         case 11:

    service.showRegistrations();

    break;
                case 12:

                    System.out.println("Thank You!");

                    break;

                default:

                    System.out.println("Invalid Choice!");

            }

        } while (choice != 12);

        sc.close();
    }
}