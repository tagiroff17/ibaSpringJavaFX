package todo.ui.button;

import javafx.event.Event;
import java.lang.ArrayIndexOutOfBoundsException;


public class DeleteButtonActionListener 
             extends ListTableActionListener {

	@Override
	public void handle(Event arg0) {
		
		try {
			int selectedIndex = table.getSelectionModel().getSelectedIndex();
			table.getItems().remove(selectedIndex);
			//System.out.println("Your item was successfully deleted!");
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			observableList.remove(observableList.size()-1);
		}
	}
}

