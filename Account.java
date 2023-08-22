import java.lang.String;
public class Account {
    private
        int bankID;
        int acctNumber;
        String customerName;
        String acctType;
        double acctBalance;
        int pin;
        int stripNumber;
        static int accountNumberIncrementor = 100000;

    public
        Account(int bankID, String customerName, String acctType, double acctBalance, int pin){
            this.bankID = bankID;
            this.customerName = customerName;
            this.acctType = acctType;
            this.acctBalance = acctBalance;
            this.pin = pin;
            stripNumber = generateStripNumber(bankID);
            this.acctNumber = generateAccountNumber(stripNumber, acctType);
        }

        int getBankID(){ return bankID; }
        int getAcctNumber(){ return acctNumber; }
        String getCustomerName(){ return customerName; }
        String getAcctType(){ return acctType; }
        double getAcctBalance(){ return acctBalance; }
        int getPIN(){ return pin; }
        int getStripNumber(){ return stripNumber; }

        void setAcctBalance(double newAcctBalance){
            this.acctBalance = newAcctBalance;
        }

        int generateStripNumber(int bankID) {
            accountNumberIncrementor++;
            int newStripNumber = (bankID * 1000000) + accountNumberIncrementor;
            return newStripNumber;
        }

        int generateAccountNumber(int stripNumber, String acctType) {
            if((acctType.startsWith("s")) || (acctType.startsWith("S"))){
                // Savings is stripNumber with a 1 at the end
                acctNumber = (stripNumber * 10) + 1;
            } else {
                // Checking is stripNumber with a 2 at the end
                acctNumber = (stripNumber * 10) + 2;
            }
            return acctNumber;
        }

}
