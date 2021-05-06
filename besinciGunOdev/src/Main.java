import besinciGunOdev.business.abstracts.UserService;
import besinciGunOdev.business.concretes.UserManager;
import besinciGunOdev.core.adapters.GoogleAuthManagerAdapter;
import besinciGunOdev.dataAccess.concretes.HibernateUserDao;
import besinciGunOdev.entities.concretes.User;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserManager(new HibernateUserDao(),new GoogleAuthManagerAdapter());

        User registerUser1 = new User(1,"Furkan","Paşaoğlu","furkan.pasaoglu99@gmail.com","12345678",true);
        userService.register(registerUser1);

        User loginUser = new User("test1@gmail.com","123456789");
        userService.login(loginUser);
    }
}
