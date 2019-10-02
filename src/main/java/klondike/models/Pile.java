package klondike.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Pile {

    private CardStack cardStack;

    private int numberOfFaceUpCards;

    public Pile(List<Card> cards) {
        this.cardStack = new CardStack();
        this.numberOfFaceUpCards = 0;
        this.cardStack.addAll(cards);
        if (!this.cardStack.empty()) {
            flipFirstCard();
        }
    }

    private void flipFirstCard() {
        assert !this.cardStack.empty() && this.numberOfFaceUpCards == 0 && this.cardStack.peek().isFacedUp();
        this.cardStack.peek().flip();
        numberOfFaceUpCards++;
    }

    public boolean fitsIn(Card card) {
        assert card != null;
        return (this.cardStack.empty() && card.getNumber() == Number.KING) ||
                (!this.cardStack.empty() && this.cardStack.peek().isNextTo(card) && this.cardStack.peek().getColor() != card.getColor());
    }

    public List<Card> getTop(int numberOfCards) {
        assert numberOfCards <= this.numberOfFaceUpCards;
        return new ArrayList<>(this.cardStack.getCards().subList(this.cardStack.size() - numberOfCards, this.cardStack.size()));
    }

    public void addToTop(List<Card> cards) {
        assert cards != null;
        this.cardStack.addAll(cards);
        numberOfFaceUpCards += cards.size();
    }

    public void removeTop(int numberOfCards) {
        assert numberOfCards <= this.numberOfFaceUpCards;
        for (int i = 0; i < numberOfCards; i++) {
            this.cardStack.pop();
            numberOfFaceUpCards--;
        }
        if (this.numberOfFaceUpCards == 0 && !this.cardStack.empty()) {
            flipFirstCard();
        }
    }

    public int numberOfFaceUpCards() {
        return this.numberOfFaceUpCards;
    }

    public boolean empty() {
        return this.cardStack.empty();
    }

    public Stack<Card> getCards() {
        return this.cardStack.getCards();
    }
}
