package com.bridgelabz;

import java.util.regex.Pattern;

public class UserRegistration {
    // method to check firstname Valid or Invalid
    public boolean validateFirstName(String firstName) throws UserRegistrationException {
        // regex pattern for firstname
        if(Pattern.matches("[A-Z][a-z A-Z]{2,}", firstName))
            return true;
        else if (!Pattern.matches("[A-Z][a-z A-Z]{2,}", firstName))
            throw new UserRegistrationException(UserRegistrationException.MyException_Type.INVALID,"Invalid first name,please enter valid first name");
        else
            return false;
    }

    // method to check lastName Valid or Invalid
    public boolean validateLastname(String lastName) throws UserRegistrationException {
        // regex pattern for lastname
        if(Pattern.matches("[A-Z][a-z A-Z]{2,}", lastName))
            return true;
        else if (!Pattern.matches("[A-Z][a-z A-Z]{2,}", lastName))
            throw new UserRegistrationException(UserRegistrationException.MyException_Type.INVALID,"Invalid last name,please enter valid last name");
        else
            return false;
    }

    // method to check email Valid or Invalid
    public boolean validateEmail(String email) throws UserRegistrationException {
        // regex pattern for email
        if(Pattern.matches("[\\w+-]+(?:\\.[\\w+-]+)*[@][\\w]{1,}([.]{1}[a-z]{2,}){1,2}", email))
            return true;
        else if (!Pattern.matches("[\\w+-]+(?:\\.[\\w+-]+)*[@][\\w]{1,}([.]{1}[a-z]{2,}){1,2}", email))
            throw new UserRegistrationException(UserRegistrationException.MyException_Type.INVALID,"Invalid email-id,please enter valid email-id");
        else
            return false;
    }

    // method to check mobile number Valid or Invalid
    public boolean validateMobileNumber(String mobileNumber) throws UserRegistrationException {
        // regex pattern for mobile number
        if(Pattern.matches("[+]91 [6-9]\\d{9}", mobileNumber))
            return true;
        else if (!Pattern.matches("[+]91 [6-9]\\d{9}", mobileNumber))
            throw new UserRegistrationException(UserRegistrationException.MyException_Type.INVALID,"Invalid mobile number,please enter valid mobile number");
        else
            return false;
    }

    // method to check the password Valid or Invalid
    public boolean validatePassword(String password) throws UserRegistrationException {
        // regex pattern for password
        if(Pattern.matches("(?=.*[A-Z])(?=.*\\d)(?=.*[$&+,:;=?@#|'<>.-^*()%!])[a-z A-Z \\d $&+,:;=?@#|'<>.-^*()%!]{8,}", password))
            return true;
        else if (!Pattern.matches("(?=.*[A-Z])(?=.*\\d)(?=.*[$&+,:;=?@#|'<>.-^*()%!])[a-z A-Z \\d $&+,:;=?@#|'<>.-^*()%!]{8,}", password))
            throw new UserRegistrationException(UserRegistrationException.MyException_Type.INVALID,"Invalid password,please enter valid password");
        else
            return false;
    }
    
}
