package at.fhtw.swen2.patterns.observer;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Blog extends Observable {

    private String name;

}
