package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    // positive test case  for firstName return true
    @Test
    public void firstNameValidation() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            boolean actualOutput = userRegistration.validateFirstName("Vishangi");
            Assert.assertTrue(actualOutput);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // positive test case for lastName return true
    @Test
    public void lastNameValidation() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            boolean actualOutput = userRegistration.validateLastname("Dabir");
            Assert.assertTrue(actualOutput);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // positive test case for email return true
    @Test
    public void emailValidation() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            boolean actualOutput = userRegistration.validateEmail("vishangi30@gmail.com");
            Assert.assertTrue(actualOutput);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // positive test case for mobile number return true
    @Test
    public void mobileNumberValidation() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            boolean actualOutput = userRegistration.validateMobileNumber("+91 9027771915");
            Assert.assertTrue(actualOutput);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // positive test case for password return true
    @Test
    public void passwordValidation() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            boolean actualOutput = userRegistration.validatePassword("VishangiDabir@30");
            Assert.assertTrue(actualOutput);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
