package homework4and5.domain;

public abstract class Technology implements TechnologyGrade {
    protected static final int YEAR = 2005;

    public int getYear() {
        return YEAR;
    }

    public abstract void upgrade(int i);

    public abstract void downgrade(int i);

}//end of class
