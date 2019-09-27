package worldclock;

public class Clock
{
    private String location;
    private Clocktime clockTime;

    public void printClock()
    {
        System.out.print(location+"  ");
        clockTime.printTime();
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setClockTime(Clocktime clockTime) {
        this.clockTime = clockTime;
    }

    public String getLocation() {
        return location;
    }

    public Clocktime getClockTime() {
        return clockTime;
    }

    public Clock(String location, Clocktime time)
    {
        this.location = location;
        this.clockTime = time;
    }

    public Clock(String location)
    {
        this.location = location;
    }

    public Clock()
    {

    }
}
