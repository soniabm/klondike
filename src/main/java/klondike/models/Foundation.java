package klondike.models;

public class Foundation{

    private Suit suit;

    private CardStack cardStack;

    public Foundation(Suit suit) {
        cardStack = new CardStack();
        this.suit = suit;
    }

    public boolean isComplete() {
        return cardStack.size() == Number.values().length;
    }

    public boolean fitsIn(Card card) {
        assert card != null;
        return card.getSuit() == this.suit &&
                (card.getNumber() == Number.AS ||
                        (!this.cardStack.empty() && card.isNextTo(this.cardStack.peek())));
    }

    public void push(Card pop) {
        this.cardStack.push(pop);
    }

    public boolean empty() {
        return this.cardStack.empty();
    }

    public Card peek() {
        return this.cardStack.peek();
    }

    public Card pop() {
        return this.cardStack.pop();
    }
}
