package at.fhtw.swen2.pdf;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;
import org.xhtmlrenderer.pdf.ITextRenderer;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class PdfGeneratorDemo {

    private String parseThymeleafTemplate() {
        ClassLoaderTemplateResolver templateResolver = new ClassLoaderTemplateResolver();
        templateResolver.setSuffix(".html");
        templateResolver.setTemplateMode(TemplateMode.HTML);

        TemplateEngine templateEngine = new TemplateEngine();
        templateEngine.setTemplateResolver(templateResolver);

        Context context = new Context();
        context.setVariable("to", "Markus");

        return templateEngine.process("thymeleaf/hello_world", context);
    }

    private void generatePdfFromHtml(String html) throws Exception {
        String outputFolder = System.getProperty("user.home") + File.separator + "thymeleaf.pdf";
        OutputStream outputStream = new FileOutputStream(outputFolder);

        ITextRenderer renderer = new ITextRenderer();
        renderer.setDocumentFromString(html);
        renderer.layout();
        renderer.createPDF(outputStream);

        outputStream.close();
    }

    public File getGeneratedPdfDemo() throws Exception {
        startDemo();
        String outputFolder = System.getProperty("user.home") + File.separator + "thymeleaf.pdf";
        return new File(outputFolder);
    }

    public void startDemo() throws Exception {
        generatePdfFromHtml(parseThymeleafTemplate());
    }
}
