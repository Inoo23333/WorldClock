package worldclock;

public class Clocktime {
    private int hour;
    private int minute;
    private int second;

    public void printTime()
    {
        System.out.println(hour+" : "+minute+" : "+second);
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public Clocktime(int hour)
    {
        this.hour = hour;
    }

    public Clocktime(int h, int m, int s)
    {
        this.hour = h%24;
        this.minute = m%60;
        this.second = s%60;
    }

    public Clocktime(Clocktime clocktime)
    {
        this.hour = clocktime.getHour();
        this.minute = clocktime.getMinute();
        this.second = clocktime.getSecond();
    }

    public Clocktime()
    {

    }
}
