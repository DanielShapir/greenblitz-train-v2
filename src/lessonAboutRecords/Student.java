package lessonAboutRecords;

public record Student(String name , int grade , int classNum) {
    public Student ( String name ,int grade ){
        this(name,grade,9);
    }


    public String getInfo(){
        String strToReturn = (name + " is in" + grade + "th and in class number : " + classNum );
        return strToReturn;
    }
public boolean isInHighSchool(){
        if ((grade >=10) && (grade <= 12))
            return true;
            else
                return false;
}

}
