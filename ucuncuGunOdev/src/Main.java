public class Main {
    public static void main(String[] args){
        Instructor instructor = new Instructor(1,"Engin","Demiroğ","Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)",0);

        Student student1 = new Student();
        student1.setId(1);
        student1.setStudentNumber("123456");
        student1.setFirstName("Furkan");
        student1.setLastName("Paşaoğlu");
        student1.setLessonName("Java & React");

        StudentManager studentManager = new StudentManager();
        InstructorManager instructorManager = new InstructorManager();


        //Öğrenciler
        System.out.println("Öğrenciler");
        studentManager.add(student1);
        studentManager.getList(student1);

        System.out.println("-----------------");

        //Eğitmenler
        instructorManager.add(instructor);
        instructorManager.getList(instructor);
        instructorManager.courseAdd(instructor);


    }
}
