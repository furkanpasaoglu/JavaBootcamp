public class StudentManager extends UserManager{
    @Override
    public void getList(User user) {
        System.out.println("Öğrenci: " +user.getFirstName() + " "+user.getLastName());
    }
 
    @Override
    public void add(User... user) {
        super.add(user);
    }
}
