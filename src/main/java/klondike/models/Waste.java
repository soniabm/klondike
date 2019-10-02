package klondike.models;

import java.util.Stack;

public class Waste implements CardStack{

    private Stack<Card> cardStack;

    public Waste(){
        this.cardStack = new Stack<>();
    }

    public void push(Card card){
        this.cardStack.push(card);
    }

    @Override
    public boolean empty(){
        return this.cardStack.empty();
    }

    @Override
    public Card peek() {
        return this.cardStack.peek();
    }

    public Card pop(){
        return this.cardStack.pop();
    }

}
