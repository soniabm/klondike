package klondike.distributed.dispatchers;

import klondike.controllers.PlayController;

public class UndoableDispatcher extends Dispatcher {

    public UndoableDispatcher(PlayController playController) {
        super(playController);
    }

    @Override
    public void dispatch() {
        this.tcpip.send(((PlayController) this.acceptorController).undoable());
    }

}

