package besinciGunOdev.dataAccess.abstracts;

import besinciGunOdev.entities.concretes.User;

public interface UserDao {
    void register(User user);
    void login(User user);
}
