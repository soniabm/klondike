package klondike.models;

public class Waste{

    private CardStack cardStack;

    public Waste(){
        this.cardStack = new CardStack();
    }

    public void push(Card card){
        this.cardStack.push(card);
    }

    public boolean empty(){
        return this.cardStack.empty();
    }

    public Card peek() {
        return this.cardStack.peek();
    }

    public Card pop(){
        return this.cardStack.pop();
    }
}
