public class Student extends User {
    private String studentNumber;
    private String lessonName;

    public Student() {

    }

    public Student(int id, String firstName, String lastName, String studentNumber, String lessonName) {
        super(id, firstName, lastName);
        this.studentNumber = studentNumber;
        this.lessonName = lessonName;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }
}
