package wallet;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person("Ala");
        Person person2 = new Person("Iza");

        person1.wallet.money.setBalance(1000);
        person2.wallet.money.setBalance(250);

        person1.giveMoney(person1, person2, 1050);

    }
}
