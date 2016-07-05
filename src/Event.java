public class Event implements Comparable<Event>{

    private String title;
    private EventCategory category;

    public Event(){

    }

    public Event(String title, EventCategory category) throws IllegalArgumentException, NullPointerException{

        if (title.isEmpty()){
            throw  new IllegalArgumentException("Title cannot be empty!");
        }

        if (category == null){
            throw new NullPointerException("Category cannot be NULL!");
        }

        this.title = title;
        this.category = category;
    }

    public String getTitle(){

        return this.title;
    }

    public EventCategory getCategory(){

        return this.category;
    }

    // noch nicht vollständig
    public int compareTo(Event o) {

        if (this.title == o.title){

            if (this.category == o.category){

                return 0;
            }
        }
        return 0;
    }
}
