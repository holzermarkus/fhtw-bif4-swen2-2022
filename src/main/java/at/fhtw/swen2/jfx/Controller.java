package at.fhtw.swen2.jfx;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.net.URL;
import java.util.ResourceBundle;

@Component
public class Controller implements Initializable {

    @Autowired
    private MainViewModel mainViewModel;

    // FXML references
    public TextField filterTextField;
    public ListView eventsListView;

    // Action
    public void filter(ActionEvent actionEvent) {
        mainViewModel.filter();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        mainViewModel.initialize(url, resourceBundle);

        filterTextField.textProperty().bindBidirectional(mainViewModel.filterTextProperty());
        eventsListView.setItems(mainViewModel.getFilteredData());
    }
}
