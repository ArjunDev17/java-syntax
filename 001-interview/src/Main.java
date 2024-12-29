class Bank {
    private String bankName;
    private String accountType;
    private String accountName;

    public Bank(String bankName, String accountType, String accountName) {
        this.bankName = bankName;
        this.accountType = accountType;
        this.accountName = accountName;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "bankName='" + bankName + '\'' +
                ", accountType='" + accountType + '\'' +
                ", accountName='" + accountName + '\'' +
                '}';
    }
}

public class Main {

    public static void main(String[] args) {
        // Creating instances of the Bank class
        Bank bank1 = new Bank("HDFC Bank", "Savings", "Arjun Singh");

        // Displaying the bank details
        System.out.println("Bank Details:");
//        System.out.println(bank1);
//        output without toString method
//        Bank Details:
//        Bank@2c7b84de
//
        System.out.println(bank1);
//        with toString() output
//        Bank Details:
//        Bank{bankName='HDFC Bank', accountType='Savings', accountName='Arjun Singh'}

    }
}
