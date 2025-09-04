
package lessonAboutRecords;

public class Main {
    public static void main(String[] args) {
    myRecordtest();
    }

    public static void myRecordtest() {
        Student studentOne = new Student("Daniel", 11, 9);
        System.out.println(studentOne.getInfo());
        System.out.println(studentOne.isInHighSchool());

    }

}
