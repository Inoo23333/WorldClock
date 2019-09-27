package Test;

import org.junit.jupiter.api.Test;
import worldclock.Clocktime;
import worldclock.WorldClock;

import static org.junit.jupiter.api.Assertions.*;

class WorldClockTest {

    @Test
    void setBeijingTime()
    {
        WorldClock worldclock = new WorldClock();
        worldclock.initialize();
        worldclock.setWorldClock();
        Clocktime clocktime = new Clocktime(34,56,23);
        worldclock.setBeijingTime(clocktime);
        worldclock.setWorldClock();
        assertEquals(10,worldclock.getBeijingClock().getClockTime().getHour());
    }

    void setWorldClock()
    {
        WorldClock worldclock = new WorldClock();
        worldclock.initialize();
        worldclock.setWorldClock();
        Clocktime clocktime = new Clocktime(23,56,23);
        worldclock.setBeijingTime(clocktime);
        worldclock.setWorldClock();
        assertEquals(23,worldclock.getBeijingClock().getClockTime().getHour());
        assertEquals(15,worldclock.getLondonClock().getClockTime().getHour());
        assertEquals(19,worldclock.getMoscoCLock().getClockTime().getHour());
        assertEquals(1,worldclock.getSydnyClock().getClockTime().getHour());
        assertEquals(10,worldclock.getNewyorkClock().getClockTime().getHour());
    }
}