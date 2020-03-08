public class LyyraCard {
    private double balance;

    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;
    }

    // displays the card's balance
    public String toString() {
        return "The card has " + balance + " euros";
    }

    // decreases the balance by 2.50 euros
    public void payEconomical() {
        if (this.balance >= 2.50) {
            this.balance -= 2.50;
        }
    }

    // decreases the balance by 4.00 euros
    public void payGourmet() {
        if (this.balance >= 4.00) {
            this.balance -= 4.00;
        }
    }

    // deposits money to card balance
    public void loadMoney(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
        if (this.balance > 150) {
            this.balance = 150;
        }
    }
}