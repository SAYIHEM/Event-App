import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class EventCatalogImpl implements EventCatalog {

    private Map<Event, Set<Time>> allEvents = new TreeMap<Event, Set<Time>>();


    public EventCatalogImpl(){

    }

    public boolean addCatalogEntry(Event e, Set<Time> tSet) throws NullPointerException{

        if (e == null || tSet == null){
            throw new NullPointerException("Event or TimeSet cannot be NULL!");
        }


        if (this.allEvents.containsKey(e)){

            return false;
        }
        else {

            this.allEvents.put(e, tSet);
            return true;
        }
    }

    public boolean addTimeToEvent(Event e, Time t) throws NullPointerException{

        if (e == null || t == null){
            throw new NullPointerException("Event or Time cannot be NULL!");
        }

        if (this.allEvents.containsKey(e) && this.allEvents.get(e) == null){

            Set<Time> timeSet = this.allEvents.get(e);
            timeSet.add(t);
            this.allEvents.put(e, timeSet);

            return true;
        }

        return false;
    }

    public Set<Event> getAllEvents(){

        return this.allEvents.keySet();
    }

    public Set<Time> getTimesOfEvent(Event e) throws NullPointerException{

        if (e == null){
            throw new NullPointerException("Event cannot be NULL");
        }

        if (this.allEvents.containsKey(e)){

            return this.allEvents.get(e);
        }
        else {

            return null;
        }
    }

    public Map<Event, Set<Time>> filterByEventCategory(EventCategory category) throws NullPointerException{

        if (category == null){
            throw new NullPointerException("Category cannot be NULL");
        }
        //unvollständig
        return null;
    }

    public Set<Time> deleteEvent(Event e) throws NullPointerException{

        if (e == null){
            throw new NullPointerException("Event cannot be NULL");
        }

        return this.allEvents.remove(e);
    }

    public boolean deleteTime(Event e, Time t) throws NullPointerException{

        if (e == null || t == null){
            throw new NullPointerException("Event or Time cannot be NULL!");
        }

        if (this.allEvents.containsKey(e)){

            this.allEvents.remove(e);
            this.allEvents.put(e, null);

            return true;
        }
        else {

            return false;
        }
    }
}
