package Service;

import java.util.Scanner;

public class BonusLife {
    
    public static void BonuslifeSections(User bonuslife_user) {

        Scanner scanner = new Scanner(System.in);

        Cart cart = new Cart(); // Αντικείμενο για την αποθήκευση προιόντων στο καλάθι
        Products products = new Products(); // Αντικείμενο για την μεταφορά στην κλάση Products
        RenewCash renew_cash = new RenewCash(); // Αντικείμενο για την μεταφορά στην κλάση RenewCash

        System.out.println("Products (1) | Cart (2) | View Profile (3) | Renew Cash (4) | Exit (5)");
        System.out.print("Select BonusLife section: ");
        int bonuslife_section = scanner.nextInt();
        while (bonuslife_section != 5) {
            if (bonuslife_section == 1) {
                System.out.println("Select the finest nutritious products here in BonusLife");
                products.ProductCategories(cart); // Μεταφορά στην κλάση Products
            } else if (bonuslife_section == 2) {
                System.out.println("Go and order your products now");
                cart.ViewCart(); // Προβολή καλαθιού
                cart.BuyCart(bonuslife_user); // Αγορά καλαθιού
            } else if (bonuslife_section == 3) {
                System.out.println("View your profile now");
                bonuslife_user.ViewData(); // Προβολή προφίλ
            } else if (bonuslife_section == 4) {
                System.out.println("Renew your cash now to but the finest products");
                renew_cash.BonuslifeCoins(bonuslife_user); // Προβολή προφίλ
            }
            System.out.println("Products (1) | Cart (2) | View Profile (3) | Renew Cash (4) | Exit (5)");
            System.out.print("Select BonusLife section: ");
            bonuslife_section = scanner.nextInt();
        }
    }
}
