public class CourseManager{
    public void addToCourse(Course course){
        if(course.price == 0){
            System.out.println("Ücretsiz Kurs Eklendi: "+course.name);
        }else{
            System.out.println("Kurs Eklendi: "+course.name);
        }
    }
    public void removeToCourse(Instructor instructor){
        System.out.println("Eğitmen Silindi: "+instructor.name);
    }
}