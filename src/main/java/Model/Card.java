package model;

public class Card {

    private int value;
    private String imagePath;

    public Card(int value, String imagePath) {
        this.value = value;
        this.imagePath = imagePath;
    }

    public int getValue() {
        return value;
    }

    public String getImagePath() {
        return imagePath;
    }
}
