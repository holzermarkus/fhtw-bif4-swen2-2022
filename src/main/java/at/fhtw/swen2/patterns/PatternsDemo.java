package at.fhtw.swen2.patterns;

import at.fhtw.swen2.patterns.command.Command;
import at.fhtw.swen2.patterns.command.OpenCommand;
import at.fhtw.swen2.patterns.command.PrintCommand;
import at.fhtw.swen2.patterns.command.TextFile;
import at.fhtw.swen2.patterns.mediator.ChatParticipant;
import at.fhtw.swen2.patterns.mediator.ChatRoom;
import at.fhtw.swen2.patterns.mediator.ChatService;
import at.fhtw.swen2.patterns.observer.Blog;
import at.fhtw.swen2.patterns.observer.User;
import at.fhtw.swen2.patterns.templatemethod.ContractEmployee;
import at.fhtw.swen2.patterns.templatemethod.Employee;
import at.fhtw.swen2.patterns.templatemethod.PermanentEmployee;

public class PatternsDemo {

    public static void main(String[] args) {
        commandDemo();
        observerDemo();
        mediatorDemo();
        templateMethodDemo();
    }

    private static void templateMethodDemo() {
        Employee employee1 = new PermanentEmployee();
        Employee employee2 = new ContractEmployee();

        System.out.println(employee1.getProjectDetails());
        System.out.println(employee2.getProjectDetails());
    }

    private static void mediatorDemo() {
        ChatService mediator = new ChatRoom();

        ChatParticipant user1 = new ChatParticipant(mediator, "user1");
        ChatParticipant user2 = new ChatParticipant(mediator,"user2");
        ChatParticipant user3 = new ChatParticipant(mediator,"user3");
        ChatParticipant user4 = new ChatParticipant(mediator,"user4");

        user1.sendPrivateMessage("user2", "Hello user2");
        user2.sendPublicMessage("Hey all");
    }

    private static void commandDemo() {
        TextFile myTextFile = new TextFile();

        Command openCommand = new OpenCommand(myTextFile);
        openCommand.execute();

        Command printCommand = new PrintCommand(myTextFile);
        printCommand.execute();
    }

    private static void observerDemo() {
        User userA = User.builder().name("holzer").build();
        User userB = User.builder().name("mustermann").build();

        Blog blog = Blog.builder().name("Fasching").build();
        blog.addObserver(userA);
        blog.addObserver(userB);

        blog.notifyObservers("neuer Beitrag!");
    }
}
