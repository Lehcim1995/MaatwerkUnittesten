package fontys.time;

public class TimeSpawn2 implements ITimeSpan
{

    @Override
    public ITime getBeginTime()
    {
        return null;
    }

    @Override
    public ITime getEndTime()
    {
        return null;
    }

    @Override
    public int length()
    {
        return 0;
    }

    @Override
    public void setBeginTime(ITime beginTime)
    {

    }

    @Override
    public void setEndTime(ITime endTime)
    {

    }

    @Override
    public void move(int minutes)
    {

    }

    @Override
    public void changeLengthWith(int minutes)
    {

    }

    @Override
    public boolean isPartOf(ITimeSpan timeSpan)
    {
        return false;
    }

    @Override
    public ITimeSpan unionWith(ITimeSpan timeSpan)
    {
        return null;
    }

    @Override
    public ITimeSpan intersectionWith(ITimeSpan timeSpan)
    {
        return null;
    }
}
