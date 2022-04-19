package at.fhtw.swen2.jfx;

import at.fhtw.swen2.SwenSpringBootApplication;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ConfigurableApplicationContext;

public class DemoJfxApplication extends Application {

    private ConfigurableApplicationContext applicationContext;

    @Override
    public void init() {
        applicationContext = new SpringApplicationBuilder(SwenSpringBootApplication.class).run();
    }

    @Override
    public void stop() {
        applicationContext.close();
        Platform.exit();
    }

    @Override
    public void start(Stage primaryStage) {
        applicationContext.publishEvent(new StageReadyEvent(primaryStage));
    }

    static class StageReadyEvent extends ApplicationEvent {
        public StageReadyEvent(Stage stage) {
            super(stage);
        }

        public Stage getStage() {
            return ((Stage) this.getSource());
        }
    }

}
