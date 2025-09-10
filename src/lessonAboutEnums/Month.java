package lessonAboutEnums;

public enum Month {
    JAN(31),
    FEB(28),
    MAR(31),
    APR(30),
    MAY(31),
    JUN(30),
    JUL(31),
    AUG(31),
    SEP(30),
    OCT(30),
    NOV(30),
    DEC(31);

    private static int numOfmonths;
    private int numOfDays;

    Month(int getNumOfDays) {
        this.numOfDays = numOfDays;
        numOfDays++;
    }

    public int getSerialNUm() {
        return this.ordinal();
    }


}
