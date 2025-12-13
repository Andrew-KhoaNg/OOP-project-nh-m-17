package model;

public abstract class Person {
    protected Hand hand;

    public Person() {
        this.hand = new Hand();
    }

    public Hand getHand() {
        return hand;
    }

    public void hit(Card card) {
        hand.addCard(card);
    }

    public void resetHand() {
        hand.clear();
    }
}
