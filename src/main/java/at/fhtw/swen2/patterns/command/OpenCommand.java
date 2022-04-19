package at.fhtw.swen2.patterns.command;

public class OpenCommand implements Command {

    private final TextFile textFile;

    public OpenCommand(TextFile textFile) {
        this.textFile = textFile;
    }

    @Override
    public void execute() {
        textFile.open();
    }
}
