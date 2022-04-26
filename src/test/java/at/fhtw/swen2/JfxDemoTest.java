package at.fhtw.swen2;

import at.fhtw.swen2.jfx.DemoJfxApplication;
import at.fhtw.swen2.jfx.MainViewModel;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.testfx.api.FxRobot;
import org.testfx.framework.junit5.ApplicationTest;

@SpringBootTest
public class JfxDemoTest extends ApplicationTest {

    @Autowired
    private MainViewModel mainViewModel;

    @Test
    public void testButtonClick() throws Exception {
        ApplicationTest.launch(DemoJfxApplication.class);
        FxRobot robot = new FxRobot();
        //robot.clickOn(".filterButton");

    }

}
