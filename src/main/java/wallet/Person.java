package wallet;

public class Person {

    private String name;
    private Money money;

    public Person(String name, Money money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public Money getMoney() {
        return money;
    }

    public void giveMoney (Person giver, int amount){
       giver.money.subtractMoney(amount);
       takeMoney(giver, amount);
    }

    public void takeMoney(Person recever, int amount){
        recever.money.addMoney(amount);
    }


}
