package Service;

import java.util.Scanner;

public class User {
    
    private String username;
    private String password;
    private String email;
    private double bank_wallet;
    private double bonuslife_wallet;

    // Συναρτήσεις Get και Set

    public void SetUsername(String[] user_data) {

        this.username = user_data[0];
    }

    public void SetPassword(String[] user_data) {

        this.password = user_data[1];
    }

    public void SetEMail(String[] user_data) {

        this.email = user_data[2];
    }

    public void SetBankWallet(double[] wallet_data) {

        this.bank_wallet = wallet_data[0];
    }

    public void SetBonuslifeWallet(double[] wallet_data) {

        this.bonuslife_wallet = wallet_data[1];
    }

    public String GetUsername() {

        return(username);
    }

    public boolean ValidateUsername(User bonuslife_user, String username) {   // Συνάρτηση σωστού username

        boolean correct_username = false;
        if (!username.equals(this.username)) {
            System.out.println("Wrong username");
            correct_username = false;
        } else if (username.equals(this.username)) {
            correct_username = true;
        }
        return(correct_username);
    }

    public boolean ValidatePassword(User bonuslife_user, String password) {   // Συνάρτηση σωστού password

        boolean correct_password = false;
        if (!password.equals(this.password)) {
            System.out.println("Wrong password");
            correct_password = false;
        } else if (username.equals(this.password)) {
            correct_password = true;
        }
        return(correct_password);
    }

    public boolean BuyProducts(double cart_price) { // Έλεγχος αγοράς καλαθιού

        boolean cart_purchase = false;

        if (cart_price > this.bonuslife_wallet) {
            cart_purchase = false;
        } else if (cart_price <= this.bonuslife_wallet) {
            System.out.println("Purchase Successful");
            cart_purchase = true;
            this.bonuslife_wallet -= cart_price;
        }
        return(cart_purchase);
    }

    public void ViewData() {

        for (int data = 0; data < 4; data ++) {
            if (data == 0) {
                System.out.println("Username: " + this.username);
            } else if (data == 1) {
                System.out.println("Password: " + this.password);
            } else if (data == 2) {
                System.out.println("E-Mail: " + this.email);
            } else if (data == 3) {
                System.out.println("BonusLife Wallet: " + this.bonuslife_wallet);
            } 
        }
    }

    public void ViewWallet() {

        System.out.println("Bank Wallet: $" + this.bank_wallet);
    }

    public void BuyCoins(int bonuslife_coin) {

        Scanner scanner = new Scanner(System.in);

        double custom_amount = 0;
        if (bonuslife_coin != 7) {
            if (bonuslife_coin == 1) {
                boolean buy_coins = PurchaseCoins(bonuslife_coin, custom_amount);
                if (buy_coins == true) {
                    this.bank_wallet -= 10;
                    this.bonuslife_wallet += 10;
                    System.out.println("Purchase of $10 successful!");
                } else if (buy_coins == false) {
                    System.out.println("Not enough money in bank wallet");
                }
            } else if (bonuslife_coin == 2) {
                boolean buy_coins = PurchaseCoins(bonuslife_coin, custom_amount);
                if (buy_coins == true) {
                    this.bank_wallet -= 50;
                    this.bonuslife_wallet += 50;
                    System.out.println("Purchase of $50 successful!");
                } else if (buy_coins == false) {
                    System.out.println("Not enough money in bank wallet");
                }
            } else if (bonuslife_coin == 3) {
                boolean buy_coins = PurchaseCoins(bonuslife_coin, custom_amount);
                if (buy_coins == true) {
                    this.bank_wallet -= 100;
                    this.bonuslife_wallet += 100;
                    System.out.println("Purchase of $100 successful!");
                } else if (buy_coins == false) {
                    System.out.println("Not enough money in bank wallet");
                } 
            } else if (bonuslife_coin == 4) {
                boolean buy_coins = PurchaseCoins(bonuslife_coin, custom_amount);
                if (buy_coins == true) {
                    this.bank_wallet -= 500;
                    this.bonuslife_wallet += 500;
                    System.out.println("Purchase of $500 successful!");
                } else if (buy_coins == false) {
                    System.out.println("Not enough money in bank wallet");
                }
            } else if (bonuslife_coin == 5) {
                boolean buy_coins = PurchaseCoins(bonuslife_coin, custom_amount);
                if (buy_coins == true) {
                    this.bank_wallet -= 1000;
                    this.bonuslife_wallet += 1000;
                    System.out.println("Purchase of $1000 successful!");
                } else if (buy_coins == false) {
                    System.out.println("Not enough money in bank wallet");
                }
            } else if (bonuslife_coin == 6) {
                System.out.print("Enter custom amount: $");
                custom_amount = scanner.nextDouble();
                boolean buy_coins = PurchaseCoins(bonuslife_coin, custom_amount);
                if (buy_coins == true) {
                    this.bank_wallet -= 1000;
                    this.bonuslife_wallet += 1000;
                    System.out.println("Purchase of $1000 successful!");
                } else if (buy_coins == false) {
                    System.out.println("Not enough money in bank wallet");
                }
            }
        }
    }

    public boolean PurchaseCoins(int bonuslife_coin, double custom_amount) {

        Scanner scanner = new Scanner(System.in);
        
        boolean purchase_successful = false;
        System.out.print("Buy Coins (YES (1) | NO (2)): ");
        int buy_coins = scanner.nextInt();
        
        if (buy_coins == 1) {
            if (bonuslife_coin == 1) {
                if (this.bank_wallet >= 10) {
                    purchase_successful = true;
                } else {
                    purchase_successful = false;
                }
            } else if (bonuslife_coin == 2) {
                if (this.bank_wallet >= 50) {
                    purchase_successful = true;
                } else {
                    purchase_successful = false;
                }
            } else if (bonuslife_coin == 3) {
                if (this.bank_wallet >= 100) {
                    purchase_successful = true;
                } else {
                    purchase_successful = false;
                }
            } else if (bonuslife_coin == 4) {
                if (this.bank_wallet >= 500) {
                    purchase_successful = true;
                } else {
                    purchase_successful = false;
                }
            } else if (bonuslife_coin == 5) {
                if (this.bank_wallet >= 1000) {
                    purchase_successful = true;
                } else {
                    purchase_successful = false;
                }
            } else if (bonuslife_coin == 6) {
                if (this.bank_wallet >= custom_amount) {
                    purchase_successful = true;
                } else {
                    purchase_successful = false;
                }
            } 
        } else if (buy_coins == 2) {
            System.out.println("Purchase cancelled");
        } else {
            System.out.println("Wrong input");
        }
        return purchase_successful;
    }
}
