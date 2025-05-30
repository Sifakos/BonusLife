package Service;

import java.util.Scanner;

public class SignIn extends SignAccount {
    
    public static void SignInData(User bonuslife_user, String[] user_data) {

        for (int data = 0; data < user_data.length; data ++) {
            if (data == 0) {
                System.out.println("About username:\n 1. English characters\n 2. No symbols\n 3. Numbers are optional");
                String username = UsernameInput(bonuslife_user); // Συμπλήρωση  username
            } else if (data == 1) {
                System.out.println("About password:\n 1. English characters\n 2. Symbols & numbers are optional\n 3. 20 characters length");
                String password = PasswordInput(bonuslife_user); // Συμπλήρωση password
            } 
        }
    }

    public static String UsernameInput(User bonuslife_user) {

        Scanner scanner = new Scanner(System.in);

        String valid_username = "[a-zA-Z0-9]+";
        boolean correct_username = false;
        String username;
        do {
            System.out.print("Username: ");
            username = scanner.nextLine();
            if (username.isEmpty()) { // Έλεγχος ύπαρξης username 
                System.out.println("You must fill your username");
                correct_username = false;
            } else if (!username.isEmpty()) {
                if (!username.matches(valid_username)) { // Έλεγχος έγκυρου username
                    System.out.println("Invalid username");
                    correct_username = false;
                } else if (username.matches(valid_username)) { // Έλεγχος σωστού username
                    correct_username = bonuslife_user.ValidateUsername(bonuslife_user, username);
                }
            }
        } while (correct_username == false);
        return (username);
    }

    public static String PasswordInput(User bonuslife_user) {

        Scanner scanner = new Scanner(System.in);

        String valid_password = "[a-zA-Z0-9!@#$%^&*()-_=+]{20}";
        boolean correct_password = false;
        String password;
        do {
            System.out.print("Password: ");
            password = scanner.nextLine();
            if (password.isEmpty()) { // Έλεγχος ύπαρξης password 
                System.out.println("You must fill your password");
                correct_password = false;
            } else if (!password.isEmpty()) {
                if (!password.matches(valid_password)) { // Έλεγχος έγκυρου password
                    System.out.println("Invalid password");
                    correct_password = false;
                } else if (password.matches(valid_password)) { // Έλεγχος σωστού password
                    correct_password = bonuslife_user.ValidatePassword(bonuslife_user, password);
                }
            }
        } while (correct_password == false);
        return (password);
    }
}
