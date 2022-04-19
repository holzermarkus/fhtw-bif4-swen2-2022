package at.fhtw.swen2.jfx.filterHandling;

import java.util.List;

public interface FilterHandler {
    List<String> Filter(List<String> content, String filter);
}
