package assignment.carrot;

public class Transaction {
    private User sender;
    private User receiver;
    private TransactionType type;
    private int point;

    public Transaction(User sender, User receiver, TransactionType type, int point) {
        this.sender = sender;
        this.receiver = receiver;
        this.type = type;
        this.point = point;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }

    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "sender=" + sender +
                ", receiver=" + receiver +
                ", type=" + type +
                ", point=" + point +
                '}';
    }
}
