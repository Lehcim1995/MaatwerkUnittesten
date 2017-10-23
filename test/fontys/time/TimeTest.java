package fontys.time;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TimeTest
{

    private ITime time;

    @Before
    public void setUp() throws Exception
    {
        int year = 1995;
        int month = 8;
        int day = 17;
        int hour = 6;
        int min = 0;


        time = new Time(year, month, day, hour, min);
    }

    @After
    public void tearDown() throws Exception
    {
    }

    @Test
    public void getDayInWeek() throws Exception
    {

        //Default is THU (1995-08-17 is Thursday)
        assertEquals(DayInWeek.THU, time.getDayInWeek());

        //Fri
        time = new Time(time.getYear(),time.getMonth(), time.getDay() + 1, time.getHours(), time.getMinutes());

        assertEquals(DayInWeek.FRI, time.getDayInWeek());

        // Sat
        time = new Time(time.getYear(),time.getMonth(), time.getDay() + 1, time.getHours(), time.getMinutes());

        assertEquals(DayInWeek.SAT, time.getDayInWeek());

        //Sun
        time = new Time(time.getYear(),time.getMonth(), time.getDay() + 1, time.getHours(), time.getMinutes());

        assertEquals(DayInWeek.SUN, time.getDayInWeek());

        //Mon
        time = new Time(time.getYear(),time.getMonth(), time.getDay() + 1, time.getHours(), time.getMinutes());

        assertEquals(DayInWeek.MON, time.getDayInWeek());

        //Tue
        time = new Time(time.getYear(),time.getMonth(), time.getDay() + 1, time.getHours(), time.getMinutes());

        assertEquals(DayInWeek.TUE, time.getDayInWeek());

        //Wen
        time = new Time(time.getYear(),time.getMonth(), time.getDay() + 1, time.getHours(), time.getMinutes());

        assertEquals(DayInWeek.WED, time.getDayInWeek());

    }

    @Test
    public void getYear() throws Exception
    {
        assertEquals(1995, time.getYear());
    }

    @Test
    public void getMonth() throws Exception
    {

        // init test from the before
        assertEquals(time.getMonth(), 8 );
    }

    @Test
    public void getDay() throws Exception
    {
        assertEquals(17, time.getDay());
    }

    @Test
    public void getHours() throws Exception
    {
        assertEquals(6, time.getHours());
    }

    @Test
    public void getMinutes() throws Exception
    {
        assertEquals(0, time.getMinutes());
    }

    @Test
    public void plus() throws Exception
    {
        // First test with minuets
        // Start min is 0

        assertEquals("init", 0, time.getMinutes());
        time = time.plus(5);
        assertEquals("adding 5 min, min",5, time.getMinutes());
        // Add an hour, result should be the same
        assertEquals("init hours",6, time.getHours());
        time = time.plus(60);
        assertEquals("Adding 60 min, min",5, time.getMinutes());
        assertEquals("Adding 60 min, hour",7, time.getHours());

        // Check if negative works

        time = time.plus(-15);
        assertEquals("Minus test, minuets",50, time.getMinutes());
        assertEquals("Minus test, hours",6, time.getHours());
    }

    @Test
    public void compareTo() throws Exception
    {
        Time time2 = new Time((Time) time);

        assertTrue(time2.compareTo(time) == 0);

        time2 = (Time) time.plus(123);

        assertTrue(time2.compareTo(time) != 0);
    }

    @Test
    public void difference() throws Exception
    {
        // Test difference in Minutes

        Time time2 = (Time) time.plus(15);

        assertEquals(15, time2.difference(time));

        assertEquals(0, time2.difference(time2));
    }

}