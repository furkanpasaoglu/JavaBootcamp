package besinciGunOdev.business.abstracts;

import besinciGunOdev.entities.concretes.User;

public interface UserService {
    void register(User user);
    void login(User user);
}
