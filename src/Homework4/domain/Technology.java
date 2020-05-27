package Homework4.domain;

public abstract class Technology {
    protected static int year = 2005;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public abstract int upgrade(int i);
    public abstract int downgrade(int i);


}//end of class
