public class InstructorManager extends UserManager{
    @Override
    public void getList(User user) {
        System.out.println("Eğitmen: "+user.getFirstName() + " "+user.getLastName());
    }

    @Override
    public void add(User... user) {
        super.add(user);
    }

    public void courseAdd(Instructor instructor){
        if(instructor.getPrice()==0){
            System.out.println(instructor.getCourseName() + " Ücretsiz");
        }else{
            System.out.println(instructor.getCourseName() + " Kurs Fiyatı: "+instructor.getPrice());
        }
    }
}
