package assignment.carrot;

import java.util.List;

public class User {
    private Integer id;
    private String name;
    private Integer point;

    public User(int id, String name, Integer point) {
        this.id = id;
        this.name = name;
        this.point = point;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", point=" + point +
                '}';
    }

    public void sendPoint(List<Transaction> transactions, User receiver, Integer point) {
        this.setPoint(this.getPoint() - point);
        transactions.add(new Transaction(this, receiver, TransactionType.SEND, point));

        receiver.setPoint(receiver.getPoint() + point);
        transactions.add(new Transaction(this, receiver, TransactionType.RECEIVE, point));
    }

    public void askPoint(List<Transaction> transactions, User sender, Integer point) {
        this.setPoint(this.getPoint() + point);
        transactions.add(new Transaction(sender, this, TransactionType.SEND, point));

        sender.setPoint(sender.getPoint() - point);
        transactions.add(new Transaction(sender, this, TransactionType.RECEIVE, point));
    }
}
