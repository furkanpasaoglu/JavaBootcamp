public class Main {
    public static void main(String[] args) {
        Course course1 = new Course(1,"Yazılım Geliştirici Yetiştirme Kampı",0,"2 ay sürecek ücretsiz ve profesyonel bir programla, sıfırdan yazılım geliştirme öğreniyoruz.");
        Category category1 = new Category(1,"Programlama");
        Instructor instructor1 = new Instructor(1,"Engin Demirog");
        Instructor instructor2 = new Instructor(2,"Deneme");

        CourseManager courseManager = new CourseManager();
        courseManager.addToCourse(course1);

        InstructorManager authorManager = new InstructorManager();
        authorManager.addToInstructor(instructor1);
        authorManager.removeToInstructor(instructor2);

        CategoryManager categoryManager = new CategoryManager();
        categoryManager.addToCategory(category1);
    }
}
