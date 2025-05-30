package Service;

import java.util.Scanner;

public class RenewCash extends BonusLife {
    

    public static void BonuslifeCoins(User bonuslife_user) {

        Scanner scanner = new Scanner(System.in);

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
        bonuslife_user.ViewWallet(); // Εμφάνιση πορτοφολιού
        System.out.println("$10 (1) | $50 (2) | $100 (3) | $500 (4) | $1000 (5) | $Other (6) | Exit (7)");
        System.out.print("Select BonusLife Coins: ");
        int bonuslife_coin = scanner.nextInt();
        bonuslife_user.BuyCoins(bonuslife_coin); // Αγορά νομισμάτων
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
