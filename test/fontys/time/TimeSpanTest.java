package fontys.time;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TimeSpanTest
{

    private Time beginTime;
    private Time endTime;
    private TimeSpan timeSpan;

    @Before
    public void setUp() throws Exception
    {
        int year = 1995;
        int month = 8;
        int day = 17;
        int hour = 6;
        int min = 0;

        endTime = new Time(year, month, day, hour, min);
        beginTime = new Time(year, month, day - 1, hour, min);

        timeSpan = new TimeSpan(beginTime, endTime);
    }

    @After
    public void tearDown() throws Exception
    {
    }

    @Test
    public void getBeginTime() throws Exception
    {
        assertEquals(beginTime, timeSpan.getBeginTime());
    }

    @Test
    public void getEndTime() throws Exception
    {
        assertEquals(endTime, timeSpan.getEndTime());
    }

    @Test
    public void length() throws Exception
    {
        int day = 1440;

        assertEquals(day, timeSpan.length());
    }

    @Test
    public void setBeginTime() throws Exception
    {
        Time newBeginTime = (Time) timeSpan.getEndTime().plus(-720); // A time earlyer then endtime

        timeSpan.setBeginTime(newBeginTime);
    }

    @Test
    public void setEndTime() throws Exception
    {
        Time newEndTime = (Time) timeSpan.getBeginTime().plus(1440);

        timeSpan.setEndTime(newEndTime);

    }

    @Test
    public void move() throws Exception
    {
        int length = timeSpan.length();

        timeSpan.move(50);

        assertEquals(length, timeSpan.length());
    }

    @Test
    public void changeLengthWith() throws Exception
    {
        int originalLength = timeSpan.length();
        int changeWith = 100;

        timeSpan.changeLengthWith(changeWith);

        assertEquals(originalLength + changeWith, timeSpan.length());
    }

    @Test
    public void isPartOf() throws Exception
    {
        int toAdd = timeSpan.length()/4;

        TimeSpan partOf = new TimeSpan(timeSpan.getBeginTime().plus(toAdd), timeSpan.getEndTime());

        assertTrue(partOf.isPartOf(timeSpan));
        assertTrue(timeSpan.isPartOf(partOf));




    }

    @Test
    public void unionWith() throws Exception
    {

        TimeSpan union = null;

        timeSpan.unionWith(union);

        // Check if intercepting
        // CHeck if null

        // When


        fail();
    }

    @Test
    public void intersectionWith() throws Exception
    {

        TimeSpan intersect = null;

        timeSpan.intersectionWith(intersect);



        fail();
    }

}