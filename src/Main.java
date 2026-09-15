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
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

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

                    Event event = new Event(id, name, date, venue, category, capacity);

                    service.addEvent(event);

                    break;

                case 2:
                    service.showEvents();
                    break;
                case 3:
                    System.out.println("Total Events: " + service.getTotalEvents());
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
                            department);

                    service.addStudent(student);

                    break;
                case 5:
                    service.showStudents();
                    break;
                case 6:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");

            }

        } while (choice != 6);

        sc.close();
    }
}
