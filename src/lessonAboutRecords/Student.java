package lessonAboutRecords;

public record Student(String name , int grade) {
    public String getInfo(){
        String strToReturn = (name + " is in" + grade + "th");
        return strToReturn;
    }
public boolean isInHighSchool(){
        if (grade >=10 && grade <= 12)
            return true;
            else
                return false;
}

}
