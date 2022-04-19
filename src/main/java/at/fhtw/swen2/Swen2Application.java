package at.fhtw.swen2;

import at.fhtw.swen2.jfx.MainViewModel;
import at.fhtw.swen2.jfx.MyJavaFxApplication;
import javafx.application.Application;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
@Slf4j
public class Swen2Application {

    public static void main(String[] args) {
        Application.launch(MyJavaFxApplication.class, args);
    }

}
