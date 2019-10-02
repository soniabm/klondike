package klondike.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Stock implements CardStack{

    private Stack<Card> cardStack;

    public Stock() {
        this.cardStack = new Stack<>();
        for (Suit suit : Suit.values()) {
            for (Number number : Number.values()) {
                this.cardStack.add(new Card(suit, number));
            }
        }
        Collections.shuffle(this.cardStack);
    }

    public List<Card> takeTop(int quantity) {
        assert 0 < quantity && quantity <= this.cardStack.size();
        List<Card> cardsToReturn = new ArrayList<>(this.cardStack.subList(0, quantity));
        this.cardStack.removeAll(cardsToReturn);
        return cardsToReturn;
    }

    @Override
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

    @Override
    public Card peek() {
        return this.cardStack.peek();
    }
}
