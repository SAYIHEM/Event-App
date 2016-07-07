import java.util.Arrays;
import java.util.Set;

public class Test {

    public static void main(String[] args) {

        Event event2 = new Event("e1", EventCategory.EXHIBITION);
        Event event3 = new Event("e2", EventCategory.EXHIBITION);
        Event event4 = new Event("p1", EventCategory.PRESENTATION);
        Event event5 = new Event("p2", EventCategory.PRESENTATION);
        Event event6 = new Event("p3", EventCategory.PRESENTATION);
        Event event7 = new Event("s1", EventCategory.SHOW);
        Event event8 = new Event("s2", EventCategory.SHOW);
        Event event9 = new Event("s3", EventCategory.SHOW);

        EventCatalogImpl eventCatalog = new EventCatalogImpl();
        
    }
}
