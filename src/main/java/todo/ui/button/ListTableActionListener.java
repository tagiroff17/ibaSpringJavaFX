package todo.ui.button;

import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;


public abstract class ListTableActionListener implements EventHandler<Event> {
	
    protected ListView<String> table; 
    protected ObservableList<String> observableList;
    protected TextField textField;
    
    public void setObservableList(ObservableList<String> observableList) {
        this.observableList = observableList;
    }
    
    public void setTable(ListView<String> itemTable) {
        this.table = itemTable;
    }
    
    public void setTextField(TextField textField) {
        this.textField = textField;
    }
}