package com.bridgelabz;

import java.util.regex.Pattern;

public class UserRegistration {
    // method to check firstname Valid or Invalid
    public boolean validateFirstName(String firstName) {
        // regex pattern for firstname
        return Pattern.matches("[A-Z][a-z A-Z]{2,}", firstName);
    }

    // method to check lastName Valid or Invalid
    public boolean validateLastname(String lastName) {
        // regex pattern for lastname
        return Pattern.matches("[A-Z][a-z A-Z]{2,}", lastName);
    }

    // method to check email Valid or Invalid
    public boolean validateEmail(String email) {
        // regex pattern for email
        return Pattern.matches("[a-z][A-Z a-z \\d]+[@][a-z]+[.][a-z]{2,5}", email);
    }

    // method to check mobile number Valid or Invalid
    public boolean validateMobileNumber(String mobileNumber) {
        // regex pattern for mobile number
        return Pattern.matches("[+]91 [6-9]\\d{9}", mobileNumber);
    }

    // method to check the password Valid
    public boolean validatePassword(String password) {
        // regex pattern for password
        return Pattern.matches("(?=.*[A-Z])(?=.*\\d)(?=.*[$&+,:;=?@#|'<>.-^*()%!])[a-z A-Z \\d $&+,:;=?@#|'<>.-^*()%!]{8,}", password);
    }
    
}
