public class Transaction {
    private String transactionId;
    private double amount;
    private String date;
    private String type;

    public Transaction(String transactionId, double amount, String date, String type) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.date = date;
        this.type = type;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}