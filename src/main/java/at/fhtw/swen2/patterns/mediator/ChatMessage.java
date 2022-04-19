package at.fhtw.swen2.patterns.mediator;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ChatMessage {

    private boolean isPrivate;
    private String receiver;
    private String message;

}
