package at.fhtw.swen2.patterns.mediator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class ChatParticipant {

    private String userid;
    private final ChatService chatRoom;

    public ChatParticipant(ChatService chatRoom, String userId) {
        this.chatRoom = chatRoom;
        this.userid = userId;
        this.chatRoom.login(this);
    }

    public void receiveMessage(String text) {
        System.out.println(text);
    }



    public void sendPrivateMessage(String receiver, String message) {
        chatRoom.sendPrivateMessage(this, receiver, message);
    }


    public void sendPublicMessage(String message) {
        chatRoom.sendPublicMessage(this, message);
    }
}
