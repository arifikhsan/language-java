package assignment.carrot;

import java.time.LocalDateTime;
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

    public void sendPoint(List<History> histories, User receiver, Integer point) {
        this.setPoint(this.getPoint() - point);
        histories.add(new History(this, receiver, TransactionType.SEND, point, LocalDateTime.now()));

        receiver.setPoint(receiver.getPoint() + point);
        histories.add(new History(this, receiver, TransactionType.RECEIVE, point, LocalDateTime.now()));
    }

    public void askPoint(List<History> histories, User sender, Integer point) {
        this.setPoint(this.getPoint() + point);
        histories.add(new History(sender, this, TransactionType.SEND, point, LocalDateTime.now()));

        sender.setPoint(sender.getPoint() - point);
        histories.add(new History(sender, this, TransactionType.RECEIVE, point, LocalDateTime.now()));
    }
}
