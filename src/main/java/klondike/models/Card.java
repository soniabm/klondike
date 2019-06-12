package klondike.models;

public class Card {

    private Suit suit;

    private Number number;

    private boolean facedUp;

    public Card(Suit suit, Number number) {
        assert suit != null;
        assert number != null;
        this.suit = suit;
        this.number = number;
        this.facedUp = false;
    }
    public Card(Suit suit, Number number, boolean facedUp) {
        this(suit,number);
        this.facedUp = facedUp;
    }

    public Card flip() {
        this.facedUp = !this.facedUp;
        return this;
    }

    public boolean isNextTo(Card card) {
        return (this.getNumber().getValue() - 1) == card.getNumber().getValue();
    }

    public boolean isFacedUp() {
        return facedUp;
    }

    public Number getNumber() {
        return this.number;
    }

    public Suit getSuit() {
        return this.suit;
    }

    public Color getColor() {
        return this.suit.getColor();
    }

    public Card copy() {
        Card copy = new Card(this.suit, this.number, this.facedUp);
        return copy;
    }
}
