public class UserManager {
    public void getList(User user){
        System.out.println(user.getFirstName() + " " + user.getLastName());
    }

    public void add(User... user){
        for(User users: user){
            System.out.println(users.getFirstName() + " " + users.getLastName() + " Başarıyla Eklendi");
        }
    }
}
