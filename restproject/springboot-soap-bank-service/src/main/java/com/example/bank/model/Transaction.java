public class Transaction {
    private String transactionId;
    private double amount;
    private String date;
    private String accountNumber;

    public Transaction() {
    }

    public Transaction(String transactionId, double amount, String date, String accountNumber) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.date = date;
        this.accountNumber = accountNumber;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}