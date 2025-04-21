package helper.src.helper;

public class Transaction {
    private String txnDate;
    private int txnAmount;

    public Transaction(String txnDate, int txnAmount) {
        this.txnDate = txnDate;
        this.txnAmount = txnAmount;
    }


    public String getTxnDate() {
        return txnDate;
    }

    public void setTxnDate(String txnDate) {
        this.txnDate = txnDate;
    }

    public int getTxnAmount() {
        return txnAmount;
    }

    public void setTxnAmount(int txnAmount) {
        this.txnAmount = txnAmount;
    }


}
