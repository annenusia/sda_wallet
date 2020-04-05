package wallet;

public class Person {

    private String name;
    private Money money;

    Wallet wallet = new Wallet();

    public Person(String name, Money money) {
        this.name = name;
        this.money = money;
    }

    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Money getMoney() {
        return money;
    }

    public void giveMoney (Person giver, Person recever, int amount){
       giver.wallet.money.subtractMoney(amount);
       takeMoney(recever, amount);
    }

    public void takeMoney(Person recever, int amount){
        recever.wallet.money.addMoney(amount);
    }


}
