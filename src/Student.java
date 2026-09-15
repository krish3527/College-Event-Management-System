public class Student {

    private String studentId;
    private String studentName;
    private String studentEmail;
    private String department;

    public Student(String studentId, String studentName, String studentEmail, String department) {

        this.studentId = studentId;
        this.studentName = studentName;
        this.studentEmail = studentEmail;
        this.department = department;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public String getDepartment() {
        return department;
    }
}