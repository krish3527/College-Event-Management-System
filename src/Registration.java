public class Registration {

    private String registrationId;
    private Student student;
    private Event event;
    private String registrationDate;

    public Registration(String registrationId, Student student,
                        Event event, String registrationDate) {

        this.registrationId = registrationId;
        this.student = student;
        this.event = event;
        this.registrationDate = registrationDate;
    }

    public String getRegistrationId() {
        return registrationId;
    }

    public Student getStudent() {
        return student;
    }

    public Event getEvent() {
        return event;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }
}