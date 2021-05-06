package besinciGunOdev.business.concretes;

import besinciGunOdev.business.abstracts.UserService;
import besinciGunOdev.business.contants.Messages;
import besinciGunOdev.core.adapters.AuthService;
import besinciGunOdev.core.utilities.business.BusinessRules;
import besinciGunOdev.core.utilities.business.ValidationTool;
import besinciGunOdev.core.utilities.helpers.EmailHelper;
import besinciGunOdev.core.utilities.validators.UserValidator;
import besinciGunOdev.dataAccess.abstracts.UserDao;
import besinciGunOdev.entities.concretes.User;

import java.util.ArrayList;

public class UserManager implements UserService {
    private UserDao userDao;
    private AuthService authService;
    private ArrayList<User> userList = new ArrayList<User>();

    public UserManager(UserDao userDao,AuthService authService) {
        this.userDao = userDao;
        this.authService =authService;

        fakeInMemoryData();
    }

    @Override
    public void register(User user) {
        var result = ValidationTool.run(UserValidator.validate(user));
        var rules = BusinessRules.run(CheckUserMailExists(user));
        if(result && rules && user.isAuthType()==true){
            EmailHelper.sendVerificationMail();
            EmailHelper.verifiedUser();
            authService.authGoogle(user);
        }
        else if(result && CheckUserMailExists(user) && user.isAuthType()==false){
            EmailHelper.sendVerificationMail();
            EmailHelper.verifiedUser();
            userDao.register(user);
        }
        else{
            System.out.println(Messages.unSuccessfulRegister);
        }
    }

    @Override
    public void login(User user) {
        for (User users:userList){
            if(user.getEmail() == users.getEmail() && user.getPassword() == users.getPassword()){
                var result = UserValidator.validate(user.getEmail(),user.getPassword());
                if(result){
                    userDao.login(user);
                    return;
                }
            }
            else{
                System.out.println(Messages.unSuccessfulLogin);
                return;
            }
        }
    }

    private boolean CheckUserMailExists(User users){
        for(User user:userList){
            if(user.getEmail() != users.getEmail()){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
    private void fakeInMemoryData() {
        User fakeUser1 = new User(1,"test 1","test 1","test1@gmail.com","123456789",true);
        User fakeUser2 = new User(2,"test 2","test 2","test2@gmail.com","789456123",true);
        User fakeUser3 = new User(3,"test 3","test 3","test3@gmail.com","456789123",false);
        User fakeUser4 = new User(4,"test 4","test 4","test4@gmail.com","821123456",false);

        userList.add(fakeUser1);
        userList.add(fakeUser2);
        userList.add(fakeUser3);
        userList.add(fakeUser4);
    }
}
