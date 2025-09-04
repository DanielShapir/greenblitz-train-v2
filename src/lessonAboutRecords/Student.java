package lessonAboutRecords;

public record Student(String name , int grade) {
    public String getInfo(){
        String strToReturn = (name + " is in" + grade + "th");
        return strToReturn;
    }

}
