public class Event {
    private String eventId;
    private String eventName;
    private String date;
    private String venue;
    private String category;
    private int  capacity;

    public Event(String eventId, String eventName,String date, String venue,String category, int capacity) {
        
    this.eventId = eventId;
    this.eventName = eventName;
    this.date = date;
    this.venue = venue;
    this.category = category;
    this.capacity = capacity;
    }   
    @Override
public String toString() {
    return "Event ID : " + eventId +
           "\nName     : " + eventName +
           "\nDate     : " + date +
           "\nVenue    : " + venue +
           "\nCategory : " + category +
           "\nCapacity : " + capacity +
           "\n------------------------";
}
}
