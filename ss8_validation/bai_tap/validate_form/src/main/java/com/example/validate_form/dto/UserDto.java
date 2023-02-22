package com.example.validate_form.dto;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class UserDto implements Validator {
    private int id;
    @NotEmpty(message = "Name not empty")
    @Size(min = 5,max = 45, message = "Size middle 5-45")
    private String firstName;
    @NotEmpty(message = "Name not empty")
    @Size(min = 5,max = 45, message = "Size middle 5-45")
    private String lastName;
    @Min(value = 18,message = "Age up 18")
    private int age;
    @Email(message = "email sai")
    private String email;
    private String phoneNumber;
    public UserDto() {
    }

    public UserDto(int id, String firstName, String lastName, int age, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
    }

    public UserDto(int id, String firstName, String lastName, int age, String email, String phoneNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {

        UserDto userDto = (UserDto) target;
        String number = userDto.getPhoneNumber();
        if (number.length()>11 || number.length()<10){
            errors.rejectValue("phoneNumber", "null","length form 10 to 11.");
        }
        if (!number.startsWith("0")){
            errors.rejectValue("phoneNumber", "null","phoneNumber start with 0.");
        }
        if (!number.matches("(^$|[0-9]*$)")){
            errors.rejectValue("phoneNumber", "null","phoneNumber only include number.");
        }
    }
}
