package com.platzi.javatests.util;

public class PasswordUtil {

    public enum securityLevel {
        WEAK, MEDIUM, STRONG
    }

    public static securityLevel assessPassword(String password) {

        if (password.length() < 8 || password.matches("[a-zA-z]+")) {
            return securityLevel.WEAK;
        }

        if (password.matches("[a-zA-z0-9]+")) {
            return securityLevel.MEDIUM;
        }

        return securityLevel.STRONG;
    }
}
