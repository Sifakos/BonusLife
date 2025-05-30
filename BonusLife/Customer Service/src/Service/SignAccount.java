package Service;

import java.util.Scanner;

public class SignAccount {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        User bonuslife_user = new User(); // Αντικείμενο για τα δεδομένα του χρήστη
        SignUp sign_up = new SignUp(); // Αντικείμενο για την μεταφορά στην κλάση SignUp
        SignIn sign_in = new SignIn(); // Αντικείμενο για την μεταφορά στην κλάση SignIn
        BonusLife bonuslife = new BonusLife(); // Αντικείμενο για την μεταφορά στην κλάση BonusLife

        String[] user_data = new String[3]; // Πίνακας για την προσωρινή αποθήκευση δεδομένων του χρήστη
        double[] wallet_data = new double[2]; // Πίνακας για την προσωρινή αποθήκευση πορτοφολιών του χρήστη

        System.out.println("Welcome to BonusLife");
        System.out.println("Sign-Up (1) | Sign-In (2)");
        System.out.print("Select sign method: ");
        int sign_account = scanner.nextInt();
        if (sign_account == 1) {
            System.out.println("Sign-Up to BonusLife");
            sign_up.SignUpData(user_data, wallet_data); // Μεταφορά στην κλάση SignUp
            // Αποθήκευση δεδομένων στην κλάση User
            bonuslife_user.SetUsername(user_data);
            bonuslife_user.SetPassword(user_data);
            bonuslife_user.SetEMail(user_data);
            // Αποθήκευση πορτοφολιών στην κλάση User
            bonuslife_user.SetBankWallet(wallet_data);
            bonuslife_user.SetBonuslifeWallet(wallet_data);
        } else if (sign_account == 2) {
            System.out.println("Sign-In to BonusLife");
            sign_in.SignInData(bonuslife_user, user_data); // Μεταφορά στην κλάση SignIn
        }
        System.out.println("Welcome, " + bonuslife_user.GetUsername());
        bonuslife.BonuslifeSections(bonuslife_user); // Μεταφορά στην κλάση BonusLife
    }
}