package besinciGunOdev.googleAuth;

import besinciGunOdev.entities.concretes.User;

public class GoogleAuthManager {
    public void auth(User user){
        System.out.println("Google ile kayıt yapıldı "+ user.getEmail());
    }
}
