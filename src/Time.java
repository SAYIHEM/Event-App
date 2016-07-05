public class Time {

    private String hour;
    private String minute;

    public Time(){

    }

    public Time(int hour, int minute) throws IllegalArgumentException{

        if (hour < 0 || hour > 24){
            throw new IllegalArgumentException("Day only has 24 hours!");
        }

        if (minute < 0 || minute > 60){
            throw new IllegalArgumentException("Hour only has 60 minutes");
        }

        this.hour = Integer.toString(hour);
        this.minute = Integer.toString(minute);
    }

    public int getHour(){

        return Integer.parseInt(this.hour);
    }

    public int getMinute(){

        return Integer.parseInt(this.minute);
    }
}
