package org.karthikeyan.methods;

public class UserRegistration {
    public boolean validateSignup(String username, String password, String email){
        if(username == null || password == null || email == null){
            return false;
        }
        if(username.trim().isEmpty()) return false;
        if(password.length() < 8) return false;
        if(!email.contains("@")) return false;

        return true;
    }
}
