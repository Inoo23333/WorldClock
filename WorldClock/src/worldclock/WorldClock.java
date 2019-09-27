package worldclock;

import java.util.Calendar;
import java.util.Date;

public class WorldClock
{
    private Clock BeijingClock;
    private Clock LondonClock;
    private Clock MoscoCLock;
    private Clock SydnyClock;
    private Clock NewyorkClock;

    public Clock getBeijingClock() {
        return BeijingClock;
    }

    public Clock getLondonClock() {
        return LondonClock;
    }

    public Clock getMoscoCLock() {
        return MoscoCLock;
    }

    public Clock getNewyorkClock() {
        return NewyorkClock;
    }

    public Clock getSydnyClock() {
        return SydnyClock;
    }

    public void setBeijingTime(Clocktime clocktime)
    {
        BeijingClock = new Clock("Beijing",clocktime);
    }

    public void initialize()
    {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());//填入当前时间

        Clocktime now = new Clocktime();
        now.setHour(calendar.get(Calendar.HOUR_OF_DAY));
        now.setMinute(calendar.get(Calendar.MINUTE));
        now.setSecond(calendar.get(Calendar.SECOND));
        BeijingClock = new Clock("Beijing", now);
        LondonClock = new Clock("London");
        MoscoCLock = new Clock("Mosco");
        SydnyClock = new Clock("Sydny");
        NewyorkClock = new Clock("NewYork");
    }

    public void setWorldClock()
    {
        Clocktime LondonTime = new Clocktime(BeijingClock.getClockTime());
        LondonTime.setHour(LondonTime.getHour()-8>0?LondonTime.getHour()-8:LondonTime.getHour()-8+24);
        LondonClock.setClockTime(LondonTime);

        Clocktime MoscoTime = new Clocktime(BeijingClock.getClockTime());
        MoscoTime.setHour(MoscoTime.getHour()-4>0?MoscoTime.getHour()-4:MoscoTime.getHour()-4+24);
        MoscoCLock.setClockTime(MoscoTime);

        Clocktime SydnyTime = new Clocktime(BeijingClock.getClockTime());
        SydnyTime.setHour(SydnyTime.getHour()+2<24?SydnyTime.getHour()+2:SydnyTime.getHour()+2-24);
        SydnyClock.setClockTime(SydnyTime);

        Clocktime NewyorkTime = new Clocktime(BeijingClock.getClockTime());
        NewyorkTime.setHour(NewyorkTime.getHour()-13>=0?NewyorkTime.getHour()-13:NewyorkTime.getHour()-13+24);
        NewyorkClock.setClockTime(NewyorkTime);
    }

    public void printWorldClock()
    {
        BeijingClock.printClock();
        LondonClock.printClock();
        MoscoCLock.printClock();
        SydnyClock.printClock();
        NewyorkClock.printClock();
    }

    public WorldClock()
    {

    }
}
