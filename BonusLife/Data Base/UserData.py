class UserData:

    def ViewAllUsers(users):
        user_counter = 1
        for user in users:
            print("User", user_counter,":\n")
            print("Username:", users[user].username)
            print("Password:", users[user].password)
            print("E-Mail:", users[user].email)
            print("Bank Wallet:", users[user].bank_wallet)
            print("BonusLife Wallet:", users[user].bonuslife_wallet)
            user_counter += 1

    def ViewSpecificUser(users, key_username):
        pos = -1
        user_found = False
        user = 0
        while (user < len(users) and user_found == False):
            if (users[user].username == key_username):
                pos = user
                user_found = True
            else:
                user += 1
        print("Username:", users[pos].username)
        print("Password:", users[pos].password)
        print("E-Mail:", users[pos].email)
        print("Bank Wallet:", users[pos].bank_wallet)
        print("BonusLife Wallet:", users[pos].bonuslife_wallet)

    def ViewData(users):
        print("All Users (1) | Specific User (2) | Exit (3)")
        user_data = int(input("Select user view: "))
        while (user_data != 3):
            if (user_data == 1):
                UserData.ViewAllUsers(users) # Προβολή στοιχείων όλων των χρηστών
            elif (user_data == 2):
                key_username = input("Enter username: ")
                if (key_username in users.username):
                    UserData.ViewSpecificUser(users, key_username) # Προβολή στοιχείων συγκεκριμένυ χρήστη
                elif (key_username not in users.username):
                    print("User not found")
            print("All Users (1) | Specific User (2) | Exit (3)")
            user_data = int(input("Select user view: "))    