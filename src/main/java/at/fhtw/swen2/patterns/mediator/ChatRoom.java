package at.fhtw.swen2.patterns.mediator;

import com.google.common.collect.Maps;

import java.util.Map;

public class ChatRoom implements ChatService  {

    private Map<String, ChatParticipant> participantMap = Maps.newHashMap();

    @Override
    public void login(ChatParticipant cp) {
        participantMap.put(cp.getUserid(), cp);
    }

    @Override
    public void sendPrivateMessage(ChatParticipant sender, String receiver, String message) {
        ChatParticipant participant = participantMap.get(receiver);
        participant.receiveMessage(message);
    }

    @Override
    public void sendPublicMessage(ChatParticipant sender, String message) {
        participantMap.values().forEach(cp -> cp.receiveMessage(message));
    }
}
