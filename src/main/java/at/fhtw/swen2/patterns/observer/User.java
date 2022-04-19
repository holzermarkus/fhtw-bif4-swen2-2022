package at.fhtw.swen2.patterns.observer;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User implements Observer {

    private String name;

    @Override
    public void update(Observable observable, Object object) {
        System.out.println(this.toString() + ": update from " + observable + ": " + object);
    }
}
