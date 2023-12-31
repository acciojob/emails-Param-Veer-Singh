package com.driver;

public class Email {

    private String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String oldPassword, String newPassword){
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character
        if(!password.equals(oldPassword))return;
        int length = newPassword.length();
        int upperCaseLetters = 0;
        int lowerCaseLetters = 0;
        int digits = 0;
        int specialCharacters = 0;
        
        for(int i=0; i<length; i++){
            char ch = newPassword.charAt(i);
            if(Character.isDigit(ch))digits++;
            else if(Character.isUpperCase(ch)) upperCaseLetters++;
            else if (Character.isLowerCase(ch)) lowerCaseLetters++;
            else specialCharacters++;
        }

        if(upperCaseLetters > 0 && lowerCaseLetters > 0 && digits > 0 && specialCharacters > 0 && length >= 8){
            password = newPassword;
        }
    }
}
