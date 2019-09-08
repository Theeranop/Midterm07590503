package com.example.midterm07590503.Auth;

public class Auth {


    private  static final String EMAIL = "kantaphu@gmail.com";
    private  static final String PASSWORD = "8888";

    private String mEmail ;
    private String mPassword ;

    public Auth(String email, String password) {
        this.mEmail = email;
        this.mPassword = password;
    }
    public boolean check()
    {
        if(mEmail.equals(EMAIL)&& mPassword.equals(PASSWORD)){
            return true ;
        } else {
            return false ;
        }
    }



}
