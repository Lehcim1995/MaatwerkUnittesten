package fontys.time;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TimeTest
{

    private Time time;

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
        assertEquals(time.getDayInWeek(), DayInWeek.FRI );

    }

    @Test
    public void getYear() throws Exception
    {
        assertEquals(time.getYear(), 1995);
    }

    @Test
    public void getMonth() throws Exception
    {
        assertEquals(time.getMonth(), 8 );
    }

    @Test
    public void getDay() throws Exception
    {
        assertEquals(time.getDay(), 17 );
    }

    @Test
    public void getHours() throws Exception
    {
        assertEquals(time.getHours(), 6 );
    }

    @Test
    public void getMinutes() throws Exception
    {
        assertEquals(time.getMinutes(), 0 );
    }

    @Test
    public void plus() throws Exception
    {
//        time.plus();
        fail();
    }

    @Test
    public void compareTo() throws Exception
    {
        fail();
    }

    @Test
    public void difference() throws Exception
    {
        fail();
    }

}