package com.yumer.javagram;

import jakarta.validation.constraints.*;
import org.springframework.format.annotation.DateTimeFormat;
import org.thymeleaf.util.DateUtils;

import java.util.Date;

public class User {
    @NotBlank(message = "First name cannot be blank")
    @Size(min = 2, message = "Too short")
    private String firstName;
    private String lastName;

    @NotBlank(message = "Username cannot be blank!")
    @Size(min = 7, message = "Username too short. Min 7 characters required.")
    @Username(message = "Special characters and upper case letters not allowed in the username.")
    private String userName;

    @Email()
    private String email;

    @Past
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Age(message = "Must be at least 18 y.o!")
    private Date dateOfBirth;

    public User() {
        dateOfBirth = new Date();
    }

    public User(String firstName, String lastName, String userName, String email, Date dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
