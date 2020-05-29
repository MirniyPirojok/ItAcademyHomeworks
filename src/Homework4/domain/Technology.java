package Homework4.domain;

public abstract class Technology implements TechnologyGrade {
    protected static final int year = 2005;

    public int getYear() {
        return year;
    }

    public abstract int upgrade(int i);
    public abstract int downgrade(int i);


}//end of class
