package Service;

import java.util.Scanner;

public class Cart {

    private double cash_cart;

    // Τρόφιμα
    private int gfuel_energy_bar_peanut;
    private int gfuel_energy_bar_chocolate;
    private int respawn_protein_bar_cookies;
    private int respawn_protein_bar_chocolate;
    private int sneak_energy_bar_blue;
    private int sneak_energy_bar_tropical;
    private int kontrolfreek_energy_bar_berry;
    private int kontrolfreek_energy_bar_vanilla;
    private int gamersupps_energy_bites_apple;
    private int gamersupps_energy_bites_mango;
    private int rogue_energy_bar_strawberry;
    private int rogue_energy_bar_cookies;

    // Ποτά
    private int gfuel_pewdiepie;
    private int gfuel_fazeberry;
    private int gamersupps_guacamole;
    private int gamersupps_mango;
    private int sneak_blue_raspberry;
    private int sneak_cherry_bomb;
    private int rogue_strawberry_kiwi;
    private int rogue_dragon_fruit;
    private int respawn_tropical_punch;
    private int respawn_citrus;
    private int mana_peach;
    private int mana_watermelon;

    // Συμπληρώματα
    private int gfuel_hydration_clickbait;
    private int gfuel_hydration_hype_sauce;
    private int gamersupps_gg_focus_titty_milk;
    private int gamersupps_gg_focus_pineapple;
    private int sneak_focus_purple_storm;
    private int sneak_focus_bubblegum;
    private int rogue_hydration_green_apple;
    private int rogue_hydration_pink_lemonade;
    private int respawn_focus_raspberry_lemonade;
    private int respawn_focus_grape;
    private int mana_energy_tangerine;
    private int mana_energy_berry;

    public void AddCart(double total_price, int id, int product_quantity) { // Προσθήκη προιόντος στο καλάθι

        this.cash_cart += total_price;
        if (id == 1) {
            this.gfuel_energy_bar_peanut += product_quantity;
        } else if (id == 2) {
            this.gfuel_energy_bar_chocolate += product_quantity;
        } else if (id == 3) {
            this.respawn_protein_bar_cookies += product_quantity;
        } else if (id == 4) {
            this.respawn_protein_bar_chocolate += product_quantity;
        } else if (id == 5) {
            this.sneak_energy_bar_blue += product_quantity;
        } else if (id == 6) {
            this.sneak_energy_bar_tropical += product_quantity;
        } else if (id == 7) {
            this.kontrolfreek_energy_bar_berry += product_quantity;
        } else if (id == 8) {
            this.kontrolfreek_energy_bar_vanilla += product_quantity;
        } else if (id == 9) {
            this.gamersupps_energy_bites_apple += product_quantity;
        } else if (id == 10) {
            this.gamersupps_energy_bites_mango += product_quantity;
        } else if (id == 11) {
            this.rogue_energy_bar_strawberry += product_quantity;
        } else if (id == 12) {
            this.rogue_energy_bar_cookies += product_quantity;
        } else if (id == 13) {
            this.gfuel_pewdiepie += product_quantity;
        } else if (id == 14) {
            this.gfuel_fazeberry += product_quantity;
        } else if (id == 15) {
            this.gamersupps_guacamole += product_quantity;
        } else if (id == 16) {
            this.gamersupps_mango += product_quantity;
        } else if (id == 17) {
            this.sneak_blue_raspberry += product_quantity;
        } else if (id == 18) {
            this.sneak_cherry_bomb += product_quantity;
        } else if (id == 19) {
            this.rogue_strawberry_kiwi += product_quantity;
        } else if (id == 20) {
            this.rogue_dragon_fruit += product_quantity;
        } else if (id == 21) {
            this.respawn_tropical_punch += product_quantity;
        } else if (id == 22) {
            this.respawn_citrus += product_quantity;
        } else if (id == 23) {
            this.mana_peach += product_quantity;
        } else if (id == 24) {
            this.mana_watermelon += product_quantity;
        } else if (id == 25) {
            this.gfuel_hydration_clickbait += product_quantity;
        } else if (id == 26) {
            this.gfuel_hydration_hype_sauce += product_quantity;
        } else if (id == 27) {
            this.gamersupps_gg_focus_titty_milk += product_quantity;
        } else if (id == 28) {
            this.gamersupps_gg_focus_pineapple += product_quantity;
        } else if (id == 29) {
            this.sneak_focus_purple_storm += product_quantity;
        } else if (id == 30) {
            this.sneak_focus_bubblegum += product_quantity;
        } else if (id == 31) {
            this.rogue_hydration_green_apple += product_quantity;
        } else if (id == 32) {
            this.rogue_hydration_pink_lemonade += product_quantity;
        } else if (id == 33) {
            this.respawn_focus_raspberry_lemonade += product_quantity;
        } else if (id == 34) {
            this.respawn_focus_grape += product_quantity;
        } else if (id == 35) {
            this.mana_energy_tangerine += product_quantity;
        } else if (id == 36) {
            this.mana_energy_berry += product_quantity;
        }
    }

    public void ViewCart() { // Προβολή καλαθιού

        Scanner scanner = new Scanner(System.in);

        // Τρόφιμα
        if (this.gfuel_energy_bar_peanut > 0) {
            System.out.println("G Fuel Energy Bar (Peanut Butter): " + this.gfuel_energy_bar_peanut);
        }
        if (this.gfuel_energy_bar_chocolate > 0) {
            System.out.println("G Fuel Energy Snack Bar (Chocolate): " + this.gfuel_energy_bar_chocolate);
        }
        if (this.respawn_protein_bar_cookies > 0) {
            System.out.println("Respawn Protein Bar (Cookies & Cream): " + this.respawn_protein_bar_cookies);
        }
        if (this.respawn_protein_bar_chocolate > 0) {
            System.out.println("Respawn Protein Bar (Chocolate Peanut Butter): " + this.respawn_protein_bar_chocolate);
        }
        if (this.sneak_energy_bar_blue > 0) {
            System.out.println("Sneak Energy Protein Bar (Blue Raspberry): " + this.sneak_energy_bar_blue);
        }
        if (this.sneak_energy_bar_tropical > 0) {
            System.out.println("Sneak Energy Protein Bar (Tropical): " + this.sneak_energy_bar_tropical);
        }
        if (this.kontrolfreek_energy_bar_berry > 0) {
            System.out.println("KontrolFreek Energy Bar (Mixed Berry): " + this.kontrolfreek_energy_bar_berry);
        }
        if (this.kontrolfreek_energy_bar_vanilla > 0) {
            System.out.println("KontrolFreek Energy Bar (Vanilla): " + this.kontrolfreek_energy_bar_vanilla);
        }
        if (this.gamersupps_energy_bites_apple > 0) {
            System.out.println("Gamer Supps Energy Bites (Sour Apple): " + this.gamersupps_energy_bites_apple);
        }
        if (this.gamersupps_energy_bites_mango > 0) {
            System.out.println("Gamer Supps Energy Bites (Mango): " + this.gamersupps_energy_bites_mango);
        }
        if (this.rogue_energy_bar_strawberry > 0) {
            System.out.println("Rogue Energy Protein Bar (Strawberry): " + this.rogue_energy_bar_strawberry);
        }
        if (this.rogue_energy_bar_cookies > 0) {
            System.out.println("Rogue Energy Protein Bar (Cookies): " + this.rogue_energy_bar_cookies);
        }

        // Ποτά
        if (this.gfuel_pewdiepie > 0) {
            System.out.println("G Fuel Energy Drink (PewDiePie Lingonberry): " + this.gfuel_pewdiepie);
        }
        if (this.gfuel_fazeberry > 0) {
            System.out.println("G Fuel Energy Drink (FaZeberry): " + this.gfuel_fazeberry);
        }
        if (this.gamersupps_guacamole > 0) {
            System.out.println("Gamer Supps GG Energy (Guacamole Gamer Fart): " + this.gamersupps_guacamole);
        }
        if (this.gamersupps_mango > 0) {
            System.out.println("Gamer Supps GG Energy (Mango Meta): " + this.gamersupps_mango);
        }
        if (this.sneak_blue_raspberry > 0) {
            System.out.println("Sneak Energy Drink (Blue Raspberry): " + this.sneak_blue_raspberry);
        }
        if (this.sneak_cherry_bomb > 0) {
            System.out.println("Sneak Energy Drink (Cherry Bomb): " + this.sneak_cherry_bomb);
        }
        if (this.rogue_strawberry_kiwi > 0) {
            System.out.println("Rogue Energy Drink (Strawberry Kiwi): " + this.rogue_strawberry_kiwi);
        }
        if (this.rogue_dragon_fruit > 0) {
            System.out.println("Rogue Energy Drink (Dragon Fruit): " + this.rogue_dragon_fruit);
        }
        if (this.respawn_tropical_punch > 0) {
            System.out.println("Respawn Energy Drink (Tropical Punch): " + this.respawn_tropical_punch);
        }
        if (this.respawn_citrus > 0) {
            System.out.println("Respawn Energy Drink (Citrus): " + this.respawn_citrus);
        }
        if (this.mana_peach > 0) {
            System.out.println("Mana Energy Drink (Peach): " + this.mana_peach);
        }
        if (this.mana_watermelon > 0) {
            System.out.println("Mana Energy Drink (Watermelon): " + this.mana_watermelon);
        }

        // Συμπληρώματα
        if (this.gfuel_hydration_clickbait > 0) {
            System.out.println("G Fuel Hydration (Clickbait): " + this.gfuel_hydration_clickbait);
        }
        if (this.gfuel_hydration_hype_sauce > 0) {
            System.out.println("G Fuel Hydration (Hype Sauce): " + this.gfuel_hydration_hype_sauce);
        }
        if (this.gamersupps_gg_focus_titty_milk > 0) {
            System.out.println("Gamer Supps GG Focus (Titty Milk): " + this.gamersupps_gg_focus_titty_milk);
        }
        if (this.gamersupps_gg_focus_pineapple > 0) {
            System.out.println("Gamer Supps GG Focus (Pineapple Cocktail): " + this.gamersupps_gg_focus_pineapple);
        }
        if (this.sneak_focus_purple_storm > 0) {
            System.out.println("Sneak Focus Formula (Purple Storm): " + this.sneak_focus_purple_storm);
        }
        if (this.sneak_focus_bubblegum > 0) {
            System.out.println("Sneak Focus Formula (Bubblegum): " + this.sneak_focus_bubblegum);
        }
        if (this.rogue_hydration_green_apple > 0) {
            System.out.println("Rogue Energy Hydration (Green Apple): " + this.rogue_hydration_green_apple);
        }
        if (this.rogue_hydration_pink_lemonade > 0) {
            System.out.println("Rogue Energy Hydration (Pink Lemonade): " + this.rogue_hydration_pink_lemonade);
        }
        if (this.respawn_focus_raspberry_lemonade > 0) {
            System.out.println("Respawn Focus Powder (Raspberry Lemonade): " + this.respawn_focus_raspberry_lemonade);
        }
        if (this.respawn_focus_grape > 0) {
            System.out.println("Respawn Focus Powder (Grape): " + this.respawn_focus_grape);
        }
        if (this.mana_energy_tangerine > 0) {
            System.out.println("Mana Energy Powder (Tangerine): " + this.mana_energy_tangerine);
        }
        if (this.mana_energy_berry > 0) {
            System.out.println("Mana Energy Powder (Berry): " + this.mana_energy_berry);
        }
    }

    public void BuyCart(User bonuslife_user) { // Αγορά καλαθιού

        Scanner scanner = new Scanner(System.in);

        System.out.println("Cart price: $" + this.cash_cart);
        System.out.print("Buy cart (YES (1) | NO (2)): ");
        int buy_cart = scanner.nextInt();
        if (buy_cart == 1) {
            double cart_price = this.cash_cart;
            boolean cart_purchase = bonuslife_user.BuyProducts(cart_price); // Έλεγχος αγοράς καλαθιού
            if (cart_purchase == true) {
                ClearCart();
            } else if (cart_purchase == false) {
                System.out.println("You have no money in your bonuslife wallet");
            }
        }
    }

    public void ClearCart() { // Καθαρισμός καλαθιού
        
        // Αρχικοποίηση του συνολικού κόστους του καλαθιού
        this.cash_cart = 0;

        // Αρχικοποίηση τροφίμων
        this.gfuel_energy_bar_peanut = 0;
        this.gfuel_energy_bar_chocolate = 0;
        this.respawn_protein_bar_cookies = 0;
        this.respawn_protein_bar_chocolate = 0;
        this.sneak_energy_bar_blue = 0;
        this.sneak_energy_bar_tropical = 0;
        this.kontrolfreek_energy_bar_berry = 0;
        this.kontrolfreek_energy_bar_vanilla = 0;
        this.gamersupps_energy_bites_apple = 0;
        this.gamersupps_energy_bites_mango = 0;
        this.rogue_energy_bar_strawberry = 0;
        this.rogue_energy_bar_cookies = 0;

        // Αρχικοποίηση ποτών
        this.gfuel_pewdiepie = 0;
        this.gfuel_fazeberry = 0;
        this.gamersupps_guacamole = 0;
        this.gamersupps_mango = 0;
        this.sneak_blue_raspberry = 0;
        this.sneak_cherry_bomb = 0;
        this.rogue_strawberry_kiwi = 0;
        this.rogue_dragon_fruit = 0;
        this.respawn_tropical_punch = 0;
        this.respawn_citrus = 0;
        this.mana_peach = 0;
        this.mana_watermelon = 0;

        // Αρχικοποίηση συμπληρωμάτων
        this.gfuel_hydration_clickbait = 0;
        this.gfuel_hydration_hype_sauce = 0;
        this.gamersupps_gg_focus_titty_milk = 0;
        this.gamersupps_gg_focus_pineapple = 0;
        this.sneak_focus_purple_storm = 0;
        this.sneak_focus_bubblegum = 0;
        this.rogue_hydration_green_apple = 0;
        this.rogue_hydration_pink_lemonade = 0;
        this.respawn_focus_raspberry_lemonade = 0;
        this.respawn_focus_grape = 0;
        this.mana_energy_tangerine = 0;
        this.mana_energy_berry = 0;
    }
}
