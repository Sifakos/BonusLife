package Service;

import java.util.Scanner;

public class Supplements {
    
    public static void SupplementProducts(Cart cart) {
        
        Scanner scanner = new Scanner(System.in);
        
        // Λίστα συμπληρωμάτων
        String[] supplement_products = {"G Fuel Hydration (Clickbait)", "G Fuel Hydration (Hype Sauce)", "Gamer Supps GG Focus (Titty Milk)", "Gamer Supps GG Focus (Pineapple Cocktail)", "Sneak Focus Formula (Purple Storm)", "Sneak Focus Formula (Bubblegum)", "Rogue Energy Hydration (Green Apple)", "Rogue Energy Hydration (Pink Lemonade)", "Respawn Focus Powder (Raspberry Lemonade)", "Respawn Focus Powder (Grape)", "Mana Energy Powder (Tangerine)", "Mana Energy Powder (Berry)"};
        System.out.println("0. Exit");
        int supplement = 1;
        for (int supplement_product = 0; supplement_product < supplement_products.length; supplement_product++) {
            System.out.println(supplement + "." + supplement_products[supplement_product]);
            supplement++;
        }
        System.out.print("Select supplement product: ");
        int supplement_product = scanner.nextInt();
        while (supplement_product != 0) {
            if (supplement_product == 1) {
                double product_price = 14.99;
                System.out.println("Product: " + supplement_products[0]);
                System.out.println("Price: $" + product_price);
                System.out.print("Quantity: ");
                int product_quantity = scanner.nextInt();
                boolean add_cart = AddProducts(product_price, product_quantity); // Έλεγχος προσθήκης προιόντος στο καλάθι
                if (add_cart) {
                    System.out.println("Product added to cart");
                    double total_price = product_price * product_quantity;
                    cart.AddCart(total_price, 25, product_quantity); // Προσθήκη προιόντος στο καλάθι
                } else {
                    System.out.println("Process cancelled");
                }
            } else if (supplement_product == 2) {
                double product_price = 14.99;
                System.out.println("Product: " + supplement_products[1]);
                System.out.println("Price: $" + product_price);
                System.out.print("Quantity: ");
                int product_quantity = scanner.nextInt();
                boolean add_cart = AddProducts(product_price, product_quantity); // Έλεγχος προσθήκης προιόντος στο καλάθι
                if (add_cart) {
                    System.out.println("Product added to cart");
                    double total_price = product_price * product_quantity;
                    cart.AddCart(total_price, 26, product_quantity); // Προσθήκη προιόντος στο καλάθι
                } else {
                    System.out.println("Process cancelled");
                }
            } else if (supplement_product == 3) {
                double product_price = 29.99;
                System.out.println("Product: " + supplement_products[2]);
                System.out.println("Price: $" + product_price);
                System.out.print("Quantity: ");
                int product_quantity = scanner.nextInt();
                boolean add_cart = AddProducts(product_price, product_quantity); // Προσθήκη προιόντος στο καλάθι
                if (add_cart) {
                    System.out.println("Product added to cart");
                    double total_price = product_price * product_quantity;
                    cart.AddCart(total_price, 27, product_quantity); // Προσθήκη προιόντος στο καλάθι
                } else {
                    System.out.println("Process cancelled");
                }
            } else if (supplement_product == 4) {
                double product_price = 29.99;
                System.out.println("Product: " + supplement_products[3]);
                System.out.println("Price: $" + product_price);
                System.out.print("Quantity: ");
                int product_quantity = scanner.nextInt();
                boolean add_cart = AddProducts(product_price, product_quantity); // Έλεγχος προσθήκης προιόντος στο καλάθι
                if (add_cart) {
                    System.out.println("Product added to cart");
                    double total_price = product_price * product_quantity;
                    cart.AddCart(total_price, 28, product_quantity); // Προσθήκη προιόντος στο καλάθι
                } else {
                    System.out.println("Process cancelled");
                }
            } else if (supplement_product == 5) {
                double product_price = 19.99;
                System.out.println("Product: " + supplement_products[4]);
                System.out.println("Price: $" + product_price);
                System.out.print("Quantity: ");
                int product_quantity = scanner.nextInt();
                boolean add_cart = AddProducts(product_price, product_quantity); // Έλεγχος προσθήκης προιόντος στο καλάθι
                if (add_cart) {
                    System.out.println("Product added to cart");
                    double total_price = product_price * product_quantity;
                    cart.AddCart(total_price, 29, product_quantity); // Προσθήκη προιόντος στο καλάθι
                } else {
                    System.out.println("Process cancelled");
                }
            } else if (supplement_product == 6) {
                double product_price = 19.99;
                System.out.println("Product: " + supplement_products[5]);
                System.out.println("Price: $" + product_price);
                System.out.print("Quantity: ");
                int product_quantity = scanner.nextInt();
                boolean add_cart = AddProducts(product_price, product_quantity); // Έλεγχος προσθήκης προιόντος στο καλάθι
                if (add_cart) {
                    System.out.println("Product added to cart");
                    double total_price = product_price * product_quantity;
                    cart.AddCart(total_price, 30, product_quantity); // Προσθήκη προιόντος στο καλάθι
                } else {
                    System.out.println("Process cancelled");
                }
            } else if (supplement_product == 7) {
                double product_price = 17.49;
                System.out.println("Product: " + supplement_products[6]);
                System.out.println("Price: $" + product_price);
                System.out.print("Quantity: ");
                int product_quantity = scanner.nextInt();
                boolean add_cart = AddProducts(product_price, product_quantity); // Έλεγχος προσθήκης προιόντος στο καλάθι
                if (add_cart) {
                    System.out.println("Product added to cart");
                    double total_price = product_price * product_quantity;
                    cart.AddCart(total_price, 31, product_quantity); // Προσθήκη προιόντος στο καλάθι
                } else {
                    System.out.println("Process cancelled");
                }
            } else if (supplement_product == 8) {
                double product_price = 17.49;
                System.out.println("Product: " + supplement_products[7]);
                System.out.println("Price: $" + product_price);
                System.out.print("Quantity: ");
                int product_quantity = scanner.nextInt();
                boolean add_cart = AddProducts(product_price, product_quantity); // Έλεγχος προσθήκης προιόντος στο καλάθι
                if (add_cart) {
                    System.out.println("Product added to cart");
                    double total_price = product_price * product_quantity;
                    cart.AddCart(total_price, 32, product_quantity); // Προσθήκη προιόντος στο καλάθι
                } else {
                    System.out.println("Process cancelled");
                }
            } else if (supplement_product == 9) {
                double product_price = 24.99;
                System.out.println("Product: " + supplement_products[8]);
                System.out.println("Price: $" + product_price);
                System.out.print("Quantity: ");
                int product_quantity = scanner.nextInt();
                boolean add_cart = AddProducts(product_price, product_quantity); // Έλεγχος προσθήκης προιόντος στο καλάθι
                if (add_cart) {
                    System.out.println("Product added to cart");
                    double total_price = product_price * product_quantity;
                    cart.AddCart(total_price, 33, product_quantity); // Προσθήκη προιόντος στο καλάθι
                } else {
                    System.out.println("Process cancelled");
                }
            } else if (supplement_product == 10) {
                double product_price = 24.99;
                System.out.println("Product: " + supplement_products[9]);
                System.out.println("Price: $" + product_price);
                System.out.print("Quantity: ");
                int product_quantity = scanner.nextInt();
                boolean add_cart = AddProducts(product_price, product_quantity); // Έλεγχος προσθήκης προιόντος στο καλάθι
                if (add_cart) {
                    System.out.println("Product added to cart");
                    double total_price = product_price * product_quantity;
                    cart.AddCart(total_price, 34, product_quantity); // Προσθήκη προιόντος στο καλάθι
                } else {
                    System.out.println("Process cancelled");
                }
            } else if (supplement_product == 11) {
                double product_price = 15.99;
                System.out.println("Product: " + supplement_products[10]);
                System.out.println("Price: $" + product_price);
                System.out.print("Quantity: ");
                int product_quantity = scanner.nextInt();
                boolean add_cart = AddProducts(product_price, product_quantity); // Έλεγχος προσθήκης προιόντος στο καλάθι
                if (add_cart) {
                    System.out.println("Product added to cart");
                    double total_price = product_price * product_quantity;
                    cart.AddCart(total_price, 35, product_quantity); // Προσθήκη προιόντος στο καλάθι
                } else {
                    System.out.println("Process cancelled");
                }
            } else if (supplement_product == 12) {
                double product_price = 15.99;
                System.out.println("Product: " + supplement_products[11]);
                System.out.println("Price: $" + product_price);
                System.out.print("Quantity: ");
                int product_quantity = scanner.nextInt();
                boolean add_cart = AddProducts(product_price, product_quantity); // Έλεγχος προσθήκης προιόντος στο καλάθι
                if (add_cart) {
                    System.out.println("Product added to cart");
                    double total_price = product_price * product_quantity;
                    cart.AddCart(total_price, 36, product_quantity); // Προσθήκη προιόντος στο καλάθι
                } else {
                    System.out.println("Process cancelled");
                }
            }
            System.out.println("0. Exit");
            supplement = 1;
            for (int i = 0; i < supplement_products.length; i++) {
                System.out.println(supplement + "." + supplement_products[i]);
                supplement++;
            }
            System.out.print("Select supplement product: ");
            supplement_product = scanner.nextInt();
        }
    }

    public static boolean AddProducts(double product_price, int product_quantity) {

        Scanner scanner = new Scanner(System.in);

        boolean add_cart = false;
        double total_price = product_price * product_quantity;
        System.out.println("Total price: $" + total_price);
        System.out.print("Add to cart (YES (1) | NO (2)): ");
        int cart_add = scanner.nextInt();
        if (cart_add == 1) {
            add_cart = true;
        } else if (cart_add == 2) {
            add_cart = false;
        }
        return add_cart;
    }
}
