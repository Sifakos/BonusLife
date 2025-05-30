package Service;

import java.util.Scanner;

public class Products extends BonusLife {
    
    public static void ProductCategories(Cart cart) {

        Scanner scanner = new Scanner(System.in);

        Food food = new Food(); // Αντικείμενο για την μεταφορά στην κλάση Food
        Drinks drinks = new Drinks(); // Αντικείμενο για την μεταφορά στην κλάση Drinks
        Supplements supplements = new Supplements(); // Αντικείμενο για την μεταφορά στην κλάση Supplements
        

        System.out.println("Food (1) | Drinks (2) | Supplements (3) | Exit (4)");
        System.out.print("Select product category: ");
        int product_category = scanner.nextInt();
        while (product_category != 4) {
            if (product_category == 1) {
                System.out.println("Snack Bars always make your gaming tummy full");
                food.FoodProducts(cart); // Μεταφορά στην κλάση Food
            } else if (product_category == 2) {
                System.out.println("Energy drinks always make your tiredness go away");
                drinks.DrinkProducts(cart); // Μεταφορά στην κλάση Drinks
            } else if (product_category == 3) {
                System.out.println("Supplements always make your muscles bigger");
                supplements.SupplementProducts(cart); // Μεταφορά στην κλάση Supplements
            }
            System.out.println("Food (1) | Drinks (2) | Supplements (3) | Exit (4)");
            System.out.print("Select product category: ");
            product_category = scanner.nextInt();
        } 
    }
}
