package com.company.myfirstsipringapp.Excaption;

public class EmployeeNotFoundException extends  Throwable{

    public EmployeeNotFoundException(String message) {
        super(message);
    }
}
