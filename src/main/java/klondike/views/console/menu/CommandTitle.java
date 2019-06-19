package klondike.views.console.menu;

public enum CommandTitle {

    STOCK2WASTE_COMMAND("Move from stock to waste"),
    WASTE2STOCK_COMMAND("Move from waste to stock"),
    WASTE2FOUNDATION_COMMAND("Move from waste to foundation"),
    WASTE2PILE_COMMAND("Move from waste to pile"),
    FOUNDATION2PILE_COMMAND("Move from foundation to pile"),
    PILE2FOUNDATION_COMMAND("Move from pile to foundation"),
    PILE2PILE_COMMAND("Move from pile to pile"),
    UNDO_COMMAND("Undo move"),
    REDO_COMMAND("Redo move"),

    NEWGAME_COMMAND("Start a new game"),
    OPENGAME_COMMAND("Open a new game"),
    EXIT_COMMAND("Exit game");

    private String title;

    CommandTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

}
