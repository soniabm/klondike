package klondike.views.console;

import klondike.controllers.Logic;
import klondike.models.Card;
import klondike.utils.IO;

public abstract class CardStackView {

    protected final Logic logic;

    private final String title;

    CardStackView(Logic logic, String title) {
        this.logic = logic;
        this.title = title;
    }

    protected void writeln(Card card) {
        IO.write(title);
        if (card == null)
            IO.writeln(Message.EMPTY);
        else
            new CardView(card).writeln();
    }

    public abstract void writeln();
}
