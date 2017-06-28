package todo.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javafx.application.Application;
import javafx.stage.Stage;
import springfox.documentation.swagger2.configuration.Swagger2DocumentationConfiguration;


public class MainFrame extends Application {
	
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
    public void start(Stage stage) {

		String[] contextPaths = new String[] {"todo/app-context.xml"};
        ApplicationContext appContext = (ApplicationContext) new ClassPathXmlApplicationContext(contextPaths);
        Swagger2DocumentationConfiguration swgDoc = (Swagger2DocumentationConfiguration) appContext.getBean("swagger2Config");
        swgDoc.swagger2Module();
        System.out.println(swgDoc.swagger2Module());
       
    ///stage setup
        stage = (Stage)appContext.getBean("mainStage");
        stage.show();

    }
    
    public void init () {
    	System.out.println("Application Started");
    }

    
}