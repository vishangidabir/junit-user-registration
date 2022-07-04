package com.bridgelabz;

public class UserRegistrationException extends Exception {
    enum MyException_Type{
        INVALID;
    }
    MyException_Type type;
    UserRegistrationException(MyException_Type type,String message) {
        super(message);
        this.type=type;
    }
}
