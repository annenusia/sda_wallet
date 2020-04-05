package wallet;

public class Wallet {

    private Money cash;

    Money money = new Money ();

    public Wallet(Money money) {
        this.money = money;
        this.money.setCurrency(Currency.PLN);
    }

    public Wallet(){}
}
