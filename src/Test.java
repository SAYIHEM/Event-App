public class Test {

    public static void main(String[] args) {

        Event event = new Event("Science Slam", EventCategory.PRESENTATION);

        int x = event.compareTo(new Event("Science", EventCategory.PRESENTATION));

        System.out.println(Integer.toString(x));
    }
}
