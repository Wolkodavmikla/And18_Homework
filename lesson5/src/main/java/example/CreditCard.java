package example;

public class CreditCard {


    int numCard;
    double numAcc;

    public CreditCard(int NumCard, double NumAcc) {
        this.numCard = NumCard;
        this.numAcc = NumAcc;
    }

    public void deposit(double amount) {
        this.numAcc += amount;

    }

    public void withdraw(double amount) {
        if (amount <= this.numAcc) {
            this.numAcc -= amount;
        } else {
            System.out.println("Недостаточно средств на карте");
        }
    }
    public  void dispInfo(){
        System.out.println("Номер счета " + numCard);
        System.out.println("Текущий баланс " + numAcc);
    }

}
