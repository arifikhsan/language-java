package assignment.carrot;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

public class History {
    private User sender;
    private User receiver;
    private TransactionType type;
    private int point;
    private LocalDateTime datetime;

    public History(User sender, User receiver, TransactionType type, int point, LocalDateTime datetime) {
        this.sender = sender;
        this.receiver = receiver;
        this.type = type;
        this.point = point;
        this.datetime = datetime;
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

    public LocalDateTime getDatetime() {
        return datetime;
    }

    public void setDatetime(LocalDateTime datetime) {
        this.datetime = datetime;
    }

    @Override
    public String toString() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss.SSS");

        if (type == TransactionType.SEND) {
            return sender.getName() + " send " + point + " point to " + receiver.getName() + " at " + datetime.toLocalDate();
        } else {
            return receiver.getName() + " receive " + point + " point from " + sender.getName() + " at " + datetime.toLocalDate();
        }
    }
}
