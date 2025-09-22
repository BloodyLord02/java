package com.education.ztu;

public class Main {
    public static void main(String[] args) {
        System.out.println(checkCredentials("user_123", "pass_456", "pass_456"));
        System.out.println(checkCredentials("user!!!", "pass", "pass"));
        System.out.println(checkCredentials("user", "short", "short1"));
    }

    public static boolean checkCredentials(String login, String password, String confirmPassword) {
        try {
            if (!login.matches("[A-Za-z0-9_]+") || login.length() >= 20) {
                throw new WrongLoginException("Логін повинен містити лише латинські літери, цифри або підкреслення та бути менше 20 символів.");
            }
            if (!password.matches("[A-Za-z0-9_]+") || password.length() >= 20 || !password.equals(confirmPassword)) {
                throw new WrongPasswordException("Пароль повинен містити лише латинські літери, цифри або підкреслення, бути менше 20 символів та збігатися з підтвердженням.");
            }

            return true;

        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Помилка: " + e.getMessage());
            return false;
        }
    }
}
