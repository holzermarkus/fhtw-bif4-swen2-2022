package at.fhtw.swen2.patterns.command;

public class PrintCommand implements Command {

    final TextFile textFile;

    public PrintCommand(TextFile textFile) {
        this.textFile = textFile;
    }

    @Override
    public void execute() {
        textFile.print();
    }
}
