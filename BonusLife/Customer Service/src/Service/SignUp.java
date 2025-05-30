package Service;

import java.util.Scanner;

public class SignUp extends SignAccount {
    
    public static void SignUpData(String[] user_data, double[] wallet_data) {

        for (int data = 0; data < user_data.length; data ++) {
            if (data == 0) {
                System.out.println("About username:\n 1. English characters\n 2. No symbols\n 3. Numbers are optional");
                String username = UsernameInput(); // Δημιουργία username
                user_data[data] = username;
                System.out.println("Username: " + user_data[data]);
            } else if (data == 1) {
                System.out.println("About password:\n 1. English characters\n 2. Symbols & numbers are optional\n 3. 20 characters length");
                String password = PasswordInput(); // Δημιουργία password
                user_data[data] = password;
                System.out.println("Password: " + user_data[data]);
            } else if (data == 2) {
                System.out.println("About e-mail:\n 1. English characters\n 2. Symbols & numbers are optional\n 3. @domain.location");
                String email = EMailInput(); // Δημιουργία email
                user_data[data] = email;
                System.out.println("E-Mail: " + user_data[data]);
            } 
        }
        for (int data = 0; data < wallet_data.length; data ++) {
            if (data == 0) {
                System.out.println("About bank wallet:\n 1. Input your card's data");
                for (int card_data = 0; card_data < 3; card_data ++) {
                    if (card_data == 0) {
                        System.out.println("About credit-card number:\n 1. 16 digits");
                        String credit_card = CreditCardInput(); // Εισαγωγή πιστωτικής κάρτας
                        System.out.println("Credit-Card: " + credit_card);
                    } else if (card_data == 1) {
                        System.out.println("About cvv:\n 1. 3 digits");
                        String cvv = CVVInput(); // Εισαγωγή cvv
                        System.out.println("CVV: " + cvv);
                    } else if (card_data == 2) {
                        System.out.println("About expiry date:\n 1. Valid date");
                        String expiry_date = ExpiryDateInput(); // Εισαγωγή ημερομηνίας λήξης 
                        System.out.println("Expiry Date: " + expiry_date);
                    }
                }
                double bank_wallet = 52167;
                System.out.println("Bank Wallet: $" + bank_wallet);
                wallet_data[data] = bank_wallet;
            } else if (data == 1) {
                double bonuslife_wallet = 0;
                System.out.println("BonusLife Wallet: $" + bonuslife_wallet);
                wallet_data[data] = bonuslife_wallet;
            } 
        }
    }

    public static String UsernameInput() {

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
                } else if (username.matches(valid_username)) {
                    correct_username = true;
                }
            }
        } while (correct_username == false);
        return (username);
    }   

    public static String PasswordInput() {

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
                } else if (password.matches(valid_password)) {
                    correct_password = true;
                }
            }
        } while (correct_password == false);
        return (password);
    }

    public static String EMailInput() {

        Scanner scanner = new Scanner(System.in);

        String valid_email = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        boolean correct_email = false;
        String email;
        do {
            System.out.print("E-Mail: ");
            email = scanner.nextLine();
            if (email.isEmpty()) { // Έλεγχος ύπαρξης email 
                System.out.println("You must fill your e-mail");
                correct_email = false;
            } else if (!email.isEmpty()) {
                if (!email.matches(valid_email)) { // Έλεγχος έγκυρου email
                    System.out.println("Invalid e-mail");
                    correct_email = false;
                } else if (email.matches(valid_email)) {
                    correct_email = true;
                }
            }
        } while (correct_email == false);
        return (email);
    }

    public static String CreditCardInput() {

        Scanner scanner = new Scanner(System.in);

        boolean correct_credit_card = false;
        String credit_card;
        do {
            System.out.print("Credit-Card number: ");
            credit_card = scanner.nextLine();
            if (credit_card.isEmpty()) { // Έλεγχος ύπαρξης πιστωτικής κάρτας 
                System.out.println("You must fill your credit-card number");
                correct_credit_card = false;
            } else if (!credit_card.isEmpty()) {
                if (credit_card.length() != 16) { // Έλεγχος έγκυρης πιστωτικής κάρτας
                    System.out.println("Invalid credit-card number");
                    correct_credit_card = false;
                } else if (credit_card.length() == 16) {
                    correct_credit_card = true;
                }
            }
        } while (correct_credit_card == false);
        String formatted_credit_card = credit_card.replaceAll("(\\d{4})(?=\\d)", "$1-");
        return (formatted_credit_card);
    }

    public static String CVVInput() {

        Scanner scanner = new Scanner(System.in);

        boolean correct_cvv = false;
        String cvv;
        do {
            System.out.print("CVV: ");
            cvv = scanner.nextLine();
            if (cvv.isEmpty()) { // Έλεγχος ύπαρξης cvv
                System.out.println("You must fill your cvv");
                correct_cvv = false;
            } else if (!cvv.isEmpty()) {
                if (cvv.length() != 3) { // Έλεγχος έγκυρου cvv
                    System.out.println("Invalid cvv");
                    correct_cvv = false;
                } else if (cvv.length() == 3) {
                    correct_cvv = true;
                }
            }
        } while (correct_cvv == false);
        return (cvv);
    }

    public static String ExpiryDateInput() {

        Scanner scanner = new Scanner(System.in);

        String valid_expiry = "(0[1-9]|1[0-2])/([0-9]{2})";
        boolean correct_expiry = false;
        String expiry_date;
        do {
            System.out.print("Expiry Date (MM/YY): ");
            expiry_date = scanner.nextLine();
            if (expiry_date.isEmpty()) {
                System.out.println("You must fill your expiry date");
                correct_expiry = false;
            } else if (!expiry_date.isEmpty()) {
                if (!expiry_date.matches(valid_expiry)) {
                    System.out.println("Invalid expiry date. Use MM/YY format (e.g., 03/24)");
                    correct_expiry = false;
                } else {
                    correct_expiry = true;
                }
            }
        } while (!correct_expiry);
        return (expiry_date);
    }
}
