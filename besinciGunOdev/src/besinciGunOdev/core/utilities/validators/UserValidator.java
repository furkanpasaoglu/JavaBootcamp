package besinciGunOdev.core.utilities.validators;

import besinciGunOdev.entities.concretes.User;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidator {
    private static final String emailPattern = "^(.+)@(\\S+)$";
    private static final Pattern pattern = Pattern.compile(emailPattern);

    public static boolean validate(User user) {
        if(user.getFirstName()!=null && user.getLastName() != null && user.getEmail() !=null && user.getPassword() !=null && user.getId()>0 || user.isAuthType() !=false || user.isAuthType() !=true){
            if(user.getPassword().length()>=6 && isValid(user.getEmail()) && user.getFirstName().length() >=2&& user.getLastName().length() >=2){
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean validate(String email,String password) {
        if(email != null && password !=null){
            return true;
        }
        return false;
    }

    private static boolean isValid(final String email) {
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
