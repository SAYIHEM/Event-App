import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class EventCatalogImpl implements EventCatalog {

    private Set<Event> allEvents = new TreeSet<Event>();


    public EventCatalogImpl(){

    }

    public boolean addCatalogEntry(Event e, Set<Time> tSet){

        return false;
    }

    public boolean addTimeToEvent(Event e, Time t){

        return false;
    }

    public Set<Event> getAllEvents(){

        return this.allEvents;
    }

    public Set<Time> getTimesOfEvent(Event e){

        return null;
    }

    public Map<Event, Set<Time>> filterByEventCategory(EventCategory category){

        return null;
    }

    public Set<Time> deleteEvent(Event e){

        return null;
    }

    public boolean deleteTime(Event e, Time t){

        return false;
    }
}
