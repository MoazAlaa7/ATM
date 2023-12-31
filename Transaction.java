import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Transaction {
    // Formats the date of the transaction
    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    private
        int bankID;
        Date currentDateTime;
        String customerName;
        double acctBalance;
        int withdrawalAmt;
        int accountNumberUsed;
        int pin;
        int stripNumber;
        int acctToWithdrawalFrom;

        // Verification that the card is allowed
        // to access the bank accounts
        boolean didCardVerify = false;

    public int getBankID() { return bankID; }
    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    // returns the current date and time as a String
    public String getCurrentDateTime() { return dateFormat.format(currentDateTime); }

    public int getPIN(){ return pin; }
    public void setPIN(int pin){
        this.pin = pin;
    }
    public void setStripNumber(int stripNumber){
        this.stripNumber = stripNumber;
    }
    public int getStripNumber(){ return stripNumber; }

    // Sets that the card has a valid stripNumber
    public void setDidTheCardVerify(boolean cardVerified){
        didCardVerify = (cardVerified)?true:false;
    }
    public boolean getDidCardVerify(){ return didCardVerify; }

    // Gets sent a 1 for savings or a 2 for checking
    // That number is added to the end of the accountNumberUsed
    public void setAcctToWithdrawalFrom(int acctToWithdrawalFrom){
        this.acctToWithdrawalFrom = acctToWithdrawalFrom;
        this.accountNumberUsed = (stripNumber * 10) + acctToWithdrawalFrom;
    }
    public int getAcctToWithdrawalFrom(){ return acctToWithdrawalFrom; }

    public void setWithdrawalAmt(int withdrawalAmt){
        this.withdrawalAmt = withdrawalAmt;
    }
    public int getWithdrawalAmt(){ return withdrawalAmt; }

    public int getAccountNumberUsed() { return accountNumberUsed; }

    public void setAcctBalance(double newAcctBalance){
        this.acctBalance = newAcctBalance;
    }
    public double getAcctBalance(){ return acctBalance; }

    Transaction(int stripNumber){
        bankID = BankNetwork.getFirstTwoDigits(stripNumber);
        currentDateTime = new Date();
        accountNumberUsed = stripNumber;
    }

}
