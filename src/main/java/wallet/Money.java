package wallet;

public class Money {

    private int balance;
    private Currency currency;

    public Money(int balance, Currency currency) {
        this.balance = balance;
        this.currency = currency;
    }

    public int getBalance() { return balance; }

    public Currency getCurrency() { return currency; }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public void addMoney(int amount){
        this.balance += amount;
    }

    public void subtractMoney(int amount){
        this.balance -= amount;
    }
}
