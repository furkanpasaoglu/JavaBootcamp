package besinciGunOdev.dataAccess.concretes;

import besinciGunOdev.dataAccess.abstracts.UserDao;
import besinciGunOdev.entities.concretes.User;

public class HibernateUserDao implements UserDao {
    @Override
    public void register(User user) {
        System.out.println("Kayıt başarılı");
    }

    @Override
    public void login(User user) {
        System.out.println("Giriş başarılı");
    }
}
