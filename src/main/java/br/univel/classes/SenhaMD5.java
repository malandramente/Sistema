package br.univel.classes;

import java.security.NoSuchAlgorithmException;

public class SenhaMD5 {
 
    public static void main(String[] args) {
        String password1 = "Senha1";
        String password2 = "Senha2";
 
        try {
            String password1MD5 = ConvertPasswordToMD5.convertPasswordToMD5(password1);
            String password2MD5 = ConvertPasswordToMD5.convertPasswordToMD5(password2);
 
            String passwordCompareMD5 = ConvertPasswordToMD5.convertPasswordToMD5(password1);
 
            System.out.println("Password1: " + password1MD5);
            System.out.println("Password2: " + password2MD5);
 
            System.out.println("passwordCompareMD5: " + passwordCompareMD5);
 
            if (password1MD5.equals(passwordCompareMD5)) {
                System.out.println("Compare OK");
            } else {
                System.out.println("Compare NOK");
            }
 
            if (password2MD5.equals(passwordCompareMD5)) {
                System.out.println("Compare OK");
            } else {
                System.out.println("Compare NOK");
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}