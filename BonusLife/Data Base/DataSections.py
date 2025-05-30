from UserData import UserData
from Finance import Finance

class DataSections:

    def SelectData(users):
        print("User Data (1) | Finance (2) | Exit (3)")
        data_select = int(input("Select data section: "))
        while (data_select != 3):
            if (data_select == 1):
                UserData.ViewData(users) # Μεταφορά στην κλάση UserData
            elif (data_select == 2):
                Finance.ViewFinances(users) # Μεταφορά στην κλάση Finance
            print("User Data (1) | Finance (2) | Product Stocks (3) | Exit (4)")
            data_select = int(input("Select data section: "))
            