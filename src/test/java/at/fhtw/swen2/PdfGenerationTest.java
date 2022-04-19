package at.fhtw.swen2;

import at.fhtw.swen2.pdf.DemoParser;
import org.junit.jupiter.api.Test;

import java.awt.*;

public class PdfGenerationTest {

    @Test
    public void testGenerateHelloWorld() throws Exception {
        Desktop.getDesktop().open(new DemoParser().getGeneratedPdfDemo());
    }

}
