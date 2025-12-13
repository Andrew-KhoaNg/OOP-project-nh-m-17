package Model;

public class Dealer {
    public boolean mustHit() {
        return hand.calculateScore() < 17;
    }
}
