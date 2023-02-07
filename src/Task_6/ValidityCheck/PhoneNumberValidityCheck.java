package Task_6.ValidityCheck;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValidityCheck {
    private static final String PHONE_REGEX = "^\\+?[\\d]+$";

    public static boolean isValidPhoneNumber(String phoneNumber) {
        Pattern pattern = Pattern.compile(PHONE_REGEX);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }

}

