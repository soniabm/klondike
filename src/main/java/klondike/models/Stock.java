package klondike.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Stock{

    private CardStack cardStack;

    public Stock() {
        this.cardStack = new CardStack();
        for (Suit suit : Suit.values()) {
            for (Number number : Number.values()) {
                this.cardStack.add(new Card(suit, number));
            }
        }
        Collections.shuffle(this.cardStack.getCards());
    }

    public List<Card> takeTop(int quantity) {
        assert 0 < quantity && quantity <= this.cardStack.size();
        List<Card> cardsToReturn = new ArrayList<>(this.cardStack.getCards().subList(0, quantity));
        this.cardStack.removeAll(cardsToReturn);
        return cardsToReturn;
    }

    public boolean empty(){
        return this.cardStack.empty();
    }

    public Card pop() {
        Card card = this.cardStack.pop();
        card.flip();
        return card;
    }

    public void push(Card card) {
        card.flip();
        this.cardStack.push(card);
    }

    public Card peek() {
        return this.cardStack.peek();
    }
}
