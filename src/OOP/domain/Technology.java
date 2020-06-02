package OOP.domain;

public abstract class Technology implements TechnologyGrade {
    protected static final int year = 2005;

    public int getYear() {
        return year;
    }

    public abstract void upgrade(int i);
    public abstract void downgrade(int i);


}//end of class
