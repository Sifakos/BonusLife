import numpy as np
import re
from DataSections import DataSections

class UserData:

    def UsernameInput():
         username = input("User's username: ")
         while (username == ""):
              print("You must fill your username")
              username = input("User's username: ")
         while (not (re.match("[a-zA-Z0-9]+", username))):
                print("Invalid username")
                username = input("User's username: ")
         return(username)
    
    def PasswordInput():
         password = input("User's password: ")
         while (password == ""):
              print("You must fill your password")
              password = input("User's password: ")
         while (not (re.match("[a-zA-Z0-9!@#$%^&*()-_=+]{20}", password))):
                print("Invalid password")
                password = input("User's password: ")
         return(password)
    
    def EMailInput():
         email = input("User's e-mail: ")
         while (email == ""):
              print("You must fill your e-mail")
              email = input("User's email: ")
         while (not (re.match("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$", email))):
                print("Invalid e-mail")
                email = input("User's e-mail: ")
         return(email)
    
    def BankWalletInput():
         bank_wallet = input("User's balance: ")
         while (bank_wallet == ""):
              print("You must fill your balance")
              bank_wallet = input("User's balance: ")
         while (bank_wallet < 0):
                print("Invalid balance")
                bank_wallet = input("User's balance: ")
         return(bank_wallet)
    
    def BonuslifeWalletInput():
         bonuslife_wallet = input("User's bonuslife balance: ")
         while (bonuslife_wallet == ""):
              print("You must fill your bonuslife balance")
              bonuslife_wallet = input("User's bonuslife balance: ")
         while (bonuslife_wallet < 0):
                print("Invalid bonuslife balance")
                bonuslife_wallet = input("User's bonuslife balance: ")
         return(bonuslife_wallet)
    
    def __init__(self, user, username, password, email, bank_wallet, bonuslife_wallet):
        self.username = username
        self.password = password
        self.email = email
        self.bank_wallet = bank_wallet
        self.bonuslife_wallet = bonuslife_wallet
          

         
    
    def main():

        # Δήλωση πινάκων για την προσωρινή αποθήκευση δεδομένων
        username = np.empty(1000000, dtype = str)
        password = np.empty(1000000, dtype = str)
        email = np.empty(1000000, dtype = str)
        bank_wallet = np.empty(1000000, dtype = float)
        bonuslife_wallet = np.empty(1000000, dtype = float)

        # Λίστα για την αποθήκευση των στοιχεών του χρήστη
        users = []
        
        for user in range(0,999999,1):
            user_username = UserData.UsernameInput() # Εισαγωγή username
            username[user] = user_username
            user_password = UserData.PasswordInput() # Εισαγωγή password
            password[user] = user_password
            user_email = UserData.EMailInput() # Εισαγωγή e-mail
            email[user] = user_email
            user_bank_wallet = UserData.BankWalletInput() # Εισαγωγή τραπεζικού πορτοφολιού
            bank_wallet[user] = user_bank_wallet
            user_bonuslife_wallet = UserData.BonuslifeWalletInput() # Εισαγωγή πορτοφολιού BonusLife
            bonuslife_wallet[user] = user_bonuslife_wallet

        for user in range(0,999999,1):
             users.append(UserData(username, password, email, bank_wallet, bonuslife_wallet))

        DataSections.SelectData(users) # Μεταφορά στην κλάση DataSections