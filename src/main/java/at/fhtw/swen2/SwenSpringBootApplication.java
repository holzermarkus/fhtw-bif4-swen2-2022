package at.fhtw.swen2;

import at.fhtw.swen2.jfx.DemoJfxApplication;
import javafx.application.Application;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class SwenSpringBootApplication {

    public static void main(String[] args) {
        Application.launch(DemoJfxApplication.class, args);
    }

}
