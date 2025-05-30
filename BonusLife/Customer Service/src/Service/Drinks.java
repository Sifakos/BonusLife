package Service;

import java.util.Scanner;

public class Drinks {
    
    public static void DrinkProducts(Cart cart) {
        
        Scanner scanner = new Scanner(System.in);
        
        // Λίστα ποτών 
        String[] drink_products = {"G Fuel Energy Drink (PewDiePie Lingonberry)", "G Fuel Energy Drink (FaZeberry)", "Gamer Supps GG Energy (Guacamole Gamer Fart)", "Gamer Supps GG Energy (Mango Meta)", "Sneak Energy Drink (Blue Raspberry)", "Sneak Energy Drink (Cherry Bomb)", "Rogue Energy Drink (Strawberry Kiwi)", "Rogue Energy Drink (Dragon Fruit)", "Respawn Energy Drink (Tropical Punch)", "Respawn Energy Drink (Citrus)", "Mana Energy Drink (Peach)", "Mana Energy Drink (Watermelon)"};
        System.out.println("0. Exit");
        int drink = 1;
        for (int drink_product = 0; drink_product < drink_products.length; drink_product++) {
            System.out.println(drink + "." + drink_products[drink_product]);
            drink++;
        }
        System.out.print("Select drink product: ");
        int drink_product = scanner.nextInt();
        while (drink_product != 0) {
            if (drink_product == 1) {
                double product_price = 2.99;
                System.out.println("Product: " + drink_products[0]);
                System.out.println("Price: $" + product_price);
                System.out.print("Quantity: ");
                int product_quantity = scanner.nextInt();
                boolean add_cart = AddProducts(product_price, product_quantity); // Έλεγχος προσθήκης προιόντος στο καλάθι
                if (add_cart) {
                    System.out.println("Product added to cart");
                    double total_price = product_price * product_quantity;
                    cart.AddCart(total_price, 13, product_quantity); // Προσθήκη προιόντος στο καλάθι
                } else {
                    System.out.println("Process cancelled");
                }
            } else if (drink_product == 2) {
                double product_price = 2.99;
                System.out.println("Product: " + drink_products[1]);
                System.out.println("Price: $" + product_price);
                System.out.print("Quantity: ");
                int product_quantity = scanner.nextInt();
                boolean add_cart = AddProducts(product_price, product_quantity); // Έλεγχος προσθήκης προιόντος στο καλάθι
                if (add_cart) {
                    System.out.println("Product added to cart");
                    double total_price = product_price * product_quantity;
                    cart.AddCart(total_price, 14, product_quantity);  // Προσθήκη προιόντος στο καλάθι
                } else {
                    System.out.println("Process cancelled");
                }
            } else if (drink_product == 3) {
                double product_price = 3.49;
                System.out.println("Product: " + drink_products[2]);
                System.out.println("Price: $" + product_price);
                System.out.print("Quantity: ");
                int product_quantity = scanner.nextInt();
                boolean add_cart = AddProducts(product_price, product_quantity); // Έλεγχος προσθήκης προιόντος στο καλάθι
                if (add_cart) {
                    System.out.println("Product added to cart");
                    double total_price = product_price * product_quantity;
                    cart.AddCart(total_price, 15, product_quantity);  // Προσθήκη προιόντος στο καλάθι
                } else {
                    System.out.println("Process cancelled");
                }
            } else if (drink_product == 4) {
                double product_price = 3.49;
                System.out.println("Product: " + drink_products[3]);
                System.out.println("Price: $" + product_price);
                System.out.print("Quantity: ");
                int product_quantity = scanner.nextInt();
                boolean add_cart = AddProducts(product_price, product_quantity); // Έλεγχος προσθήκης προιόντος στο καλάθι
                if (add_cart) {
                    System.out.println("Product added to cart");
                    double total_price = product_price * product_quantity;
                    cart.AddCart(total_price, 16, product_quantity); // Προσθήκη προιόντος στο καλάθι
                } else {
                    System.out.println("Process cancelled");
                }
            } else if (drink_product == 5) {
                double product_price = 2.79;
                System.out.println("Product: " + drink_products[4]);
                System.out.println("Price: $" + product_price);
                System.out.print("Quantity: ");
                int product_quantity = scanner.nextInt();
                boolean add_cart = AddProducts(product_price, product_quantity); // Έλεγχος προσθήκης προιόντος στο καλάθι
                if (add_cart) {
                    System.out.println("Product added to cart");
                    double total_price = product_price * product_quantity;
                    cart.AddCart(total_price, 17, product_quantity); // Προσθήκη προιόντος στο καλάθι
                } else {
                    System.out.println("Process cancelled");
                }
            } else if (drink_product == 6) {
                double product_price = 2.79;
                System.out.println("Product: " + drink_products[5]);
                System.out.println("Price: $" + product_price);
                System.out.print("Quantity: ");
                int product_quantity = scanner.nextInt();
                boolean add_cart = AddProducts(product_price, product_quantity); // Έλεγχος προσθήκης προιόντος στο καλάθι
                if (add_cart) {
                    System.out.println("Product added to cart");
                    double total_price = product_price * product_quantity;
                    cart.AddCart(total_price, 18, product_quantity); // Προσθήκη προιόντος στο καλάθι
                } else {
                    System.out.println("Process cancelled");
                }
            } else if (drink_product == 7) {
                double product_price = 3.19;
                System.out.println("Product: " + drink_products[6]);
                System.out.println("Price: $" + product_price);
                System.out.print("Quantity: ");
                int product_quantity = scanner.nextInt();
                boolean add_cart = AddProducts(product_price, product_quantity); // Έλεγχος προσθήκης προιόντος στο καλάθι
                if (add_cart) {
                    System.out.println("Product added to cart");
                    double total_price = product_price * product_quantity;
                    cart.AddCart(total_price, 19, product_quantity); // Προσθήκη προιόντος στο καλάθι
                } else {
                    System.out.println("Process cancelled");
                }
            } else if (drink_product == 8) {
                double product_price = 3.19;
                System.out.println("Product: " + drink_products[7]);
                System.out.println("Price: $" + product_price);
                System.out.print("Quantity: ");
                int product_quantity = scanner.nextInt();
                boolean add_cart = AddProducts(product_price, product_quantity); // Έλεγχος προσθήκης προιόντος στο καλάθι
                if (add_cart) {
                    System.out.println("Product added to cart");
                    double total_price = product_price * product_quantity;
                    cart.AddCart(total_price, 20, product_quantity); // Προσθήκη προιόντος στο καλάθι
                } else {
                    System.out.println("Process cancelled");
                }
            } else if (drink_product == 9) {
                double product_price = 3.29;
                System.out.println("Product: " + drink_products[8]);
                System.out.println("Price: $" + product_price);
                System.out.print("Quantity: ");
                int product_quantity = scanner.nextInt();
                boolean add_cart = AddProducts(product_price, product_quantity); // Έλεγχος προσθήκης προιόντος στο καλάθι
                if (add_cart) {
                    System.out.println("Product added to cart");
                    double total_price = product_price * product_quantity;
                    cart.AddCart(total_price, 21, product_quantity); // Προσθήκη προιόντος στο καλάθι
                } else {
                    System.out.println("Process cancelled");
                }
            } else if (drink_product == 10) {
                double product_price = 3.29;
                System.out.println("Product: " + drink_products[9]);
                System.out.println("Price: $" + product_price);
                System.out.print("Quantity: ");
                int product_quantity = scanner.nextInt();
                boolean add_cart = AddProducts(product_price, product_quantity); // Έλεγχος προσθήκης προιόντος στο καλάθι
                if (add_cart) {
                    System.out.println("Product added to cart");
                    double total_price = product_price * product_quantity;
                    cart.AddCart(total_price, 22, product_quantity); // Προσθήκη προιόντος στο καλάθι
                } else {
                    System.out.println("Process cancelled");
                }
            } else if (drink_product == 11) {
                double product_price = 2.89;
                System.out.println("Product: " + drink_products[10]);
                System.out.println("Price: $" + product_price);
                System.out.print("Quantity: ");
                int product_quantity = scanner.nextInt();
                boolean add_cart = AddProducts(product_price, product_quantity); // Έλεγχος προσθήκης προιόντος στο καλάθι
                if (add_cart) {
                    System.out.println("Product added to cart");
                    double total_price = product_price * product_quantity;
                    cart.AddCart(total_price, 23, product_quantity); // Προσθήκη προιόντος στο καλάθι
                } else {
                    System.out.println("Process cancelled");
                }
            } else if (drink_product == 12) {
                double product_price = 2.89;
                System.out.println("Product: " + drink_products[11]);
                System.out.println("Price: $" + product_price);
                System.out.print("Quantity: ");
                int product_quantity = scanner.nextInt();
                boolean add_cart = AddProducts(product_price, product_quantity); // Έλεγχος προσθήκης προιόντος στο καλάθι
                if (add_cart) {
                    System.out.println("Product added to cart");
                    double total_price = product_price * product_quantity;
                    cart.AddCart(total_price, 24, product_quantity); // Προσθήκη προιόντος στο καλάθι
                } else {
                    System.out.println("Process cancelled");
                }
            }
            System.out.println("0. Exit");
            drink = 1;
            for (int i = 0; i < drink_products.length; i++) {
                System.out.println(drink + "." + drink_products[i]);
                drink++;
            }
            System.out.print("Select drink product: ");
            drink_product = scanner.nextInt();
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
