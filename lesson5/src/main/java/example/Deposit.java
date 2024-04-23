package example;

public class Deposit {
    public static void main(String[] args) {

        CreditCard card1 = new CreditCard(1456, 3000);
        CreditCard card2 = new CreditCard(5768, 550);
        CreditCard card3 = new CreditCard(3498, 1000);


        card1.deposit(500);
        card2.deposit(545);
        card3.withdraw(690);

        System.out.println("Info about card 1: ");
        card1.dispInfo();

        System.out.println("Info about card 2: ");
        card2.dispInfo();

        System.out.println("Info about card 3: ");
        card3.dispInfo();
    }
}
