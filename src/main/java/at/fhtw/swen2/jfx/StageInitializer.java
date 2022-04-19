package at.fhtw.swen2.jfx;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class StageInitializer implements ApplicationListener<DemoJfxApplication.StageReadyEvent> {
    @Value("classpath:/MainWindow.fxml")
    private Resource appResource;
    private ApplicationContext applicationContext;

    public StageInitializer(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    public void onApplicationEvent(DemoJfxApplication.StageReadyEvent event) {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(appResource.getURL());
            fxmlLoader.setControllerFactory(aClass -> applicationContext.getBean(aClass));
            Parent parent = fxmlLoader.load();

            Stage stage = event.getStage();
            stage.setScene(new Scene(parent, 500,400));
            stage.setTitle("Event Example");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }




    }
}
