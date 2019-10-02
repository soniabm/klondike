package klondike.models;

import java.util.List;
import java.util.Stack;

public class CardStack {

    protected Stack<Card> cards;

    public CardStack() {
        this.cards = new Stack<>();
    }

    public boolean empty() {
        return this.cards.empty();
    }

    public Card peek() {
        return this.cards.peek();
    }

    public Card pop() {
        return this.cards.pop();
    }

    public void push(Card card) {
        this.cards.push(card);
    }

    public int size() {
        return this.cards.size();
    }

    public void addAll(List<Card> cards) {
        this.cards.addAll(cards);
    }

    public Stack<Card> getCards() {
        return this.cards;
    }

    public void add(Card card) {
        this.cards.add(card);
    }

    public void removeAll(List<Card> cards) {
        this.cards.removeAll(cards);
    }
}
