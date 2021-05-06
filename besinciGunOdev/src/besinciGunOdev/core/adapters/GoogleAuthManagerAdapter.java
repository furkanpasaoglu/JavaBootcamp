package besinciGunOdev.core.adapters;

import besinciGunOdev.entities.concretes.User;
import besinciGunOdev.googleAuth.GoogleAuthManager;

public class GoogleAuthManagerAdapter implements AuthService{
    @Override
    public void authGoogle(User user) {
        GoogleAuthManager googleAuthManager = new GoogleAuthManager();
        googleAuthManager.auth(user);
    }
}
