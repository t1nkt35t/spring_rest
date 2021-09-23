package ru.my3tahk.spring.rest.exception_handling;

public class NoSuchEmployeeException extends RuntimeException{
    public NoSuchEmployeeException(String message){
        super(message);
    }
}
