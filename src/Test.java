import java.io.Console;
import java.util.*;

public class Test {

    public static void main(String[] args) {

        Time time = new Time(12, 0);
        Set<Time> timeSet = new HashSet<>();
        timeSet.add(time);

        Event event2 = new Event("e1", EventCategory.EXHIBITION);
        Event event3 = new Event("e2", EventCategory.EXHIBITION);
        Event event7 = new Event("s1", EventCategory.SHOW);
        Event event4 = new Event("p1", EventCategory.PRESENTATION);
        Event event5 = new Event("p2", EventCategory.PRESENTATION);
        Event event8 = new Event("s2", EventCategory.SHOW);
        Event event6 = new Event("p3", EventCategory.PRESENTATION);
        Event event9 = new Event("s3", EventCategory.SHOW);

        EventCatalogImpl eventCatalog = new EventCatalogImpl();

        eventCatalog.addCatalogEntry(event2, timeSet);
        eventCatalog.addCatalogEntry(event3, timeSet);
        eventCatalog.addCatalogEntry(event4, timeSet);
        eventCatalog.addCatalogEntry(event5, timeSet);
        eventCatalog.addCatalogEntry(event6, timeSet);
        eventCatalog.addCatalogEntry(event7, timeSet);
        eventCatalog.addCatalogEntry(event8, timeSet);
        eventCatalog.addCatalogEntry(event9, timeSet);

        Map<Event, Set<Time>> eventMap = eventCatalog.filterByEventCategory(EventCategory.EXHIBITION);

        Set<Event> KeySet = eventMap.keySet();

        for (Event event:
             KeySet) {
            System.out.println(event + " " + eventMap.get(event));
        }
        
    }
}
