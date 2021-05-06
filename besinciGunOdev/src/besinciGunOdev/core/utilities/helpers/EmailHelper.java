package besinciGunOdev.core.utilities.helpers;

import besinciGunOdev.core.utilities.messages.Messages;

public class EmailHelper {
    public static void sendVerificationMail(){
        System.out.println(Messages.sendedVerificationMail);
    }
    public static void verifiedUser(){
        System.out.println(Messages.verifiedUser);
    }
}
