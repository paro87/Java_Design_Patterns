package com.paro.Creational_Patterns.BuilderPattern.Type2;

import java.util.Date;

public class FormBuilder {
    public String firstName;       //mandatory
    public String lastName;        //mandatory
    public String userName;        //mandatory
    public String password;        //mandatory
    public String address;
    public Date dob;
    public String email;
    public String backupEmail;
    public String spouseName;
    public String city;
    public String state;
    public String country;
    public String language;
    public String passwordHint;
    public String securityQuestion;
    public String securityAnswer;

    public FormBuilder(String firstname, String lastName, String userName,String password){
        this.firstName=firstname;
        this.lastName=lastName;
        this.userName=userName;
        this.password=password;
    }

    public FormBuilder address(String address){
        this.address = address;
        return this;
    }
    public FormBuilder dob(Date dob){
        this.dob = dob;
        return this;
    }
    public FormBuilder email(String email){
        this.email = email;
        return this;
    }
    public FormBuilder backupEmail(String backupEmail){
        this.backupEmail = backupEmail;
        return this;
    }
    public FormBuilder spouseName(String spouseName){
        this.spouseName = spouseName;
        return this;
    }
    public FormBuilder city(String city){
        this.city = city;
        return this;
    }
    public FormBuilder state(String state){
        this.state = state;
        return this;
    }
    public FormBuilder country(String country){
        this.country = country;
        return this;
    }
    public FormBuilder language(String language){
        this.language = language;
        return this;
    }
    public FormBuilder passwordHint(String passwordHint){
        this.passwordHint = passwordHint;
        return this;
    }
    public FormBuilder securityQuestion(String securityQuestion){
        this.securityQuestion = securityQuestion;
        return this;
    }
    public FormBuilder securityAnswer(String securityAnswer){
        this.securityAnswer = securityAnswer;
        return this;
    }
    public Form build(){
        return new Form(this);
    }

}
