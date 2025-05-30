class Finance:

    def ViewFinances(users):
        print("BonusLife Coins (1) | BonusLife Yealry Income (2) | Exit (3)")
        finance_select = int(input("Select finance section: "))
        while (finance_select != 3):
            if (finance_select == 1):
                bonuslife_money = 0
                for user in users:
                    bonuslife_money += users[user].bonuslife_wallet
                print("Total BonusLife coins:", bonuslife_money)
            elif (finance_select == 2):
                bonuslife_income = 0
                for user in range(0,999999,1):
                    user_cart = float(input(users[user].username, "annual cash cart: "))
                    bonuslife_income += user_cart
                print("Total BonusLife annual income for 2025:", bonuslife_income)
