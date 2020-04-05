package wallet;

public class Wallet {

    private Money money;

    public Wallet(Money money) {
        this.money = money;
        this.money.setCurrency(Currency.PLN);
    }
}
