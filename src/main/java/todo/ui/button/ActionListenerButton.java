package todo.ui.button;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;


public class ActionListenerButton extends Button {
    private EventHandler<ActionEvent> actionListener;

    public void setActionListener(EventHandler<ActionEvent> actionListener) {
        this.actionListener = actionListener;
    }

    public void init() {
        this.setOnAction(actionListener);
    }
}