package at.fhtw.swen2.patterns.mediator;

public interface ChatService {

    void login(ChatParticipant cp);
    void sendPrivateMessage(ChatParticipant sender, String receiver, String message);
    void sendPublicMessage(ChatParticipant sender, String message);


}
