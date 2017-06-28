package todo.ui.button;

import io.swagger.annotations.Api;
import javafx.event.Event;

@Api(value="Hello World", description="Hello World Controller")
public class AddNewButtonActionListener extends 
  ListTableActionListener {
	
	@Override	
	public void handle(Event arg0) {
		table.getItems().add(textField.getText());
		textField.clear();
	}
}