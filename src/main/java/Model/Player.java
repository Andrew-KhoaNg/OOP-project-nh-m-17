package model;

public class Player extends Person {

    private int money;
    private int currentBet;

    public Player(int initialMoney) {
        super();
        this.money = initialMoney;
        this.currentBet = 0;
    }

    // === BETTING ===
    public boolean setBet(int amount) {
        if (amount <= 0 || amount > money) {
            return false;
        }
        currentBet = amount;
        money -= amount;
        return true;
    }

    // === WIN / LOSE ===
    public void win(int multiplier) {
        money += currentBet * multiplier;
        currentBet = 0;
    }

    public void winBlackjack() {
        money += (int) (currentBet * 2.5);
        currentBet = 0;
    }

    public void push() {
        money += currentBet;
        currentBet = 0;
    }

    public void lose() {
        currentBet = 0;
    }

    // === GETTER ===
    public int getMoney() {
        return money;
    }

    public int getCurrentBet() {
        return currentBet;
    }

    public boolean isOutOfMoney() {
        return money <= 0;
    }
}
