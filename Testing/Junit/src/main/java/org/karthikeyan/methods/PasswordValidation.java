package org.karthikeyan.methods;

public class PasswordValidation {
    public boolean validatePassword(String s){
        if(s == null || s.length() < 8) return false;

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(uppercase().indexOf(ch) != -1) hasUpper = true;
            if(lowercase().indexOf(ch) != -1) hasLower = true;
            if(digits().indexOf(ch) != -1) hasDigit = true;
            if(specialCharacters().indexOf(ch) != -1) hasSpecial = true;
        }

        return hasUpper && hasLower && hasDigit && hasSpecial;

    }
    public static String uppercase(){
        return "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    }
    public static String lowercase(){
        return "abcdefghijklmnopqrstuvwxyz";
    }
    public static String digits(){
        return "0123456789";
    }
    public static String specialCharacters(){
        return "!@#$%^&*";
    }
}
