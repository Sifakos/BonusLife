package Service;

import java.util.Scanner;

public class Food {
    
    public static void FoodProducts(Cart cart) {

        Scanner scanner = new Scanner(System.in);
        
        // Λίστα προιόντων
        String[] food_products = {"G Fuel Energy Snack Bar (Peanut Butter)", "G Fuel Energy Snack Bar (Chocolate)", "Respawn Protein Bar (Cookies & Cream)", "Respawn Protein Bar (Chocolate Peanut Butter)", "Sneak Energy Protein Bar (Blue Raspberry)", "Sneak Energy Protein Bar (Tropical)", "KontrolFreek Energy Bar (Mixed Berry)", "KontrolFreek Energy Bar (Vanilla)", "Gamer Supps Energy Bites (Sour Apple)", "Gamer Supps Energy Bites (Mango)", "Rogue Energy Protein Bar (Strawberry)", "Rogue Energy Protein Bar (Cookies)"};
        System.out.println("0. Exit");
        int food = 1;
        for (int food_product = 0; food_product < food_products.length; food_product ++) { // Εμφάνιση προιόντων
            System.out.println(food + "." + food_products[food_product]);
            food ++;
        }
        System.out.print("Select food product: ");
        int food_product = scanner.nextInt();
        while (food_product != 0) {
            if (food_product == 1) {
                double product_price = 2.99;
                System.out.println("Product: " + food_products[0]);
                System.out.println("Price: $" + product_price);
                System.out.print("Quantity: ");
                int product_quantity = scanner.nextInt();
                boolean add_cart = AddProducts(product_price, product_quantity); // Έλεγχος προσθήκης προιόντος στο καλάθι
                if (add_cart == true) {
                    System.out.println("Product added to cart");
                    double total_price = product_price * product_quantity;
                    cart.AddCart(total_price, 1, product_quantity); // Προσθήκη προιόντος στο καλάθι
                } else if (add_cart == false) {
                    System.out.println("Proccess cancelled");
                }
            } else if (food_product == 2) {
                double product_price = 2.99;
                System.out.println("Product: " + food_products[1]);
                System.out.println("Price: $" + product_price);
                System.out.print("Quantity: ");
                int product_quantity = scanner.nextInt();
                boolean add_cart = AddProducts(product_price, product_quantity); // Έλεγχος προσθήκης προιόντος στο καλάθι
                if (add_cart == true) {
                    System.out.println("Product added to cart");
                    double total_price = product_price * product_quantity;
                    cart.AddCart(total_price, 2, product_quantity); // Προσθήκη προιόντος στο καλάθι
                } else if (add_cart == false) {
                    System.out.println("Proccess cancelled");
                }
            } else if (food_product == 3) {
                double product_price = 3.49;
                System.out.println("Product: " + food_products[2]);
                System.out.println("Price: $" + product_price);
                System.out.print("Quantity: ");
                int product_quantity = scanner.nextInt();
                boolean add_cart = AddProducts(product_price, product_quantity); // Έλεγχος προσθήκης προιόντος στο καλάθι
                if (add_cart == true) {
                    System.out.println("Product added to cart");
                    double total_price = product_price * product_quantity;
                    cart.AddCart(total_price, 3, product_quantity); // Προσθήκη προιόντος στο καλάθι
                } else if (add_cart == false) {
                    System.out.println("Proccess cancelled");
                }
            } else if (food_product == 4) {
                double product_price = 3.49;
                System.out.println("Product: " + food_products[3]);
                System.out.println("Price: $" + product_price);
                System.out.print("Quantity: ");
                int product_quantity = scanner.nextInt();
                boolean add_cart = AddProducts(product_price, product_quantity); // Έλεγχος προσθήκης προιόντος στο καλάθι
                if (add_cart == true) {
                    System.out.println("Product added to cart");
                    double total_price = product_price * product_quantity;
                    cart.AddCart(total_price, 4, product_quantity); // Προσθήκη προιόντος στο καλάθι
                } else if (add_cart == false) {
                    System.out.println("Proccess cancelled");
                }
            } else if (food_product == 5) {
                double product_price = 3.99;
                System.out.println("Product: " + food_products[4]);
                System.out.println("Price: $" + product_price);
                System.out.print("Quantity: ");
                int product_quantity = scanner.nextInt();
                boolean add_cart = AddProducts(product_price, product_quantity); // Έλεγχος προσθήκης προιόντος στο καλάθι
                if (add_cart == true) {
                    System.out.println("Product added to cart");
                    double total_price = product_price * product_quantity;
                    cart.AddCart(total_price, 5, product_quantity); // Προσθήκη προιόντος στο καλάθι
                } else if (add_cart == false) {
                    System.out.println("Proccess cancelled");
                }
            } else if (food_product == 6) {
                double product_price = 3.99;
                System.out.println("Product: " + food_products[5]);
                System.out.println("Price: $" + product_price);
                System.out.print("Quantity: ");
                int product_quantity = scanner.nextInt();
                boolean add_cart = AddProducts(product_price, product_quantity); // Έλεγχος προσθήκης προιόντος στο καλάθι
                if (add_cart == true) {
                    System.out.println("Product added to cart");
                    double total_price = product_price * product_quantity;
                    cart.AddCart(total_price, 6, product_quantity); // Προσθήκη προιόντος στο καλάθι
                } else if (add_cart == false) {
                    System.out.println("Proccess cancelled");
                }
            } else if (food_product == 7) {
                double product_price = 2.79;
                System.out.println("Product: " + food_products[6]);
                System.out.println("Price: $" + product_price);
                System.out.print("Quantity: ");
                int product_quantity = scanner.nextInt();
                boolean add_cart = AddProducts(product_price, product_quantity); // Έλεγχος προσθήκης προιόντος στο καλάθι
                if (add_cart == true) {
                    System.out.println("Product added to cart");
                    double total_price = product_price * product_quantity;
                    cart.AddCart(total_price, 7, product_quantity); // Προσθήκη προιόντος στο καλάθι
                } else if (add_cart == false) {
                    System.out.println("Proccess cancelled");
                }
            } else if (food_product == 8) {
                double product_price = 2.79;
                System.out.println("Product: " + food_products[7]);
                System.out.println("Price: $" + product_price);
                System.out.print("Quantity: ");
                int product_quantity = scanner.nextInt();
                boolean add_cart = AddProducts(product_price, product_quantity); // Έλεγχος προσθήκης προιόντος στο καλάθι
                if (add_cart == true) {
                    System.out.println("Product added to cart");
                    double total_price = product_price * product_quantity;
                    cart.AddCart(total_price, 8, product_quantity); // Προσθήκη προιόντος στο καλάθι
                } else if (add_cart == false) {
                    System.out.println("Proccess cancelled");
                }
            } else if (food_product == 9) {
                double product_price = 4.49;
                System.out.println("Product: " + food_products[8]);
                System.out.println("Price: $" + product_price);
                System.out.print("Quantity: ");
                int product_quantity = scanner.nextInt();
                boolean add_cart = AddProducts(product_price, product_quantity); // Έλεγχος προσθήκης προιόντος στο καλάθι
                if (add_cart == true) {
                    System.out.println("Product added to cart");
                    double total_price = product_price * product_quantity;
                    cart.AddCart(total_price, 9, product_quantity); // Προσθήκη προιόντος στο καλάθι
                } else if (add_cart == false) {
                    System.out.println("Proccess cancelled");
                }
            } else if (food_product == 10) {
                double product_price = 4.49;
                System.out.println("Product: " + food_products[9]);
                System.out.println("Price: $" + product_price);
                System.out.print("Quantity: ");
                int product_quantity = scanner.nextInt();
                boolean add_cart = AddProducts(product_price, product_quantity); // Έλεγχος προσθήκης προιόντος στο καλάθι
                if (add_cart == true) {
                    System.out.println("Product added to cart");
                    double total_price = product_price * product_quantity;
                    cart.AddCart(total_price, 10, product_quantity); // Προσθήκη προιόντος στο καλάθι
                } else if (add_cart == false) {
                    System.out.println("Proccess cancelled");
                }
            } else if (food_product == 11) {
                double product_price = 3.29;
                System.out.println("Product: " + food_products[10]);
                System.out.println("Price: $" + product_price);
                System.out.print("Quantity: ");
                int product_quantity = scanner.nextInt();
                boolean add_cart = AddProducts(product_price, product_quantity); // Έλεγχος προσθήκης προιόντος στο καλάθι
                if (add_cart == true) {
                    System.out.println("Product added to cart");
                    double total_price = product_price * product_quantity;
                    cart.AddCart(total_price, 11, product_quantity); // Προσθήκη προιόντος στο καλάθι
                } else if (add_cart == false) {
                    System.out.println("Proccess cancelled");
                }
            } else if (food_product == 12) {
                double product_price = 3.29;
                System.out.println("Product: " + food_products[11]);
                System.out.println("Price: $" + product_price);
                System.out.print("Quantity: ");
                int product_quantity = scanner.nextInt();
                boolean add_cart = AddProducts(product_price, product_quantity); // Έλεγχος προσθήκης προιόντος στο καλάθι
                if (add_cart == true) {
                    System.out.println("Product added to cart");
                    double total_price = product_price * product_quantity;
                    cart.AddCart(total_price, 12, product_quantity); // Προσθήκη προιόντος στο καλάθι
                } else if (add_cart == false) {
                    System.out.println("Proccess cancelled");
                }
            }
            System.out.println("0. Exit");
            food = 0;
            for (food_product = 0; food_product < food_products.length; food_product ++) {
                System.out.println(food + "." + food_products[food_product]);
                food ++;
            }
            System.out.print("Select food product: ");
            food_product = scanner.nextInt();
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
        return(add_cart);
    }
}
