package ws;

import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private Date creationDate;

    public Account(int code, double balance, Date creationDate) {
        this.id = code;
        this.balance = balance;
        this.creationDate = creationDate;
    }

    public Account() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
