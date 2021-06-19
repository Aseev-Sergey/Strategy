package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.layout.Pane;
import sample.strategy.AddArrow;
import sample.strategy.ChangePosition;
import sample.strategy.ChangeSize;
import sample.strategy.Context;
import java.net.URL;
import java.util.ResourceBundle;


public class Controller implements Initializable {

    public Pane pane;
    public Node object;
    Context context;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        object = new Node();
        pane.getChildren().add(object.getNode());
    }

    private void clearPane(){
        pane.getChildren().clear();
    }

    public void clickMove(ActionEvent actionEvent) {
        clearPane();
        context = new Context(new ChangePosition());
        context.doChanges(pane, object);
    }

    public void clickChange(ActionEvent actionEvent) {
        clearPane();
        context = new Context(new ChangeSize());
        context.doChanges(pane, object);
    }

    public void clickAdd(ActionEvent actionEvent) {
        clearPane();
        context = new Context((new AddArrow()));
        context.doChanges(pane, object);
    }

    public void clickClear(ActionEvent actionEvent) {
        clearPane();
        object = new Node();
        pane.getChildren().add(object.getNode());
    }

    public void clickClose(ActionEvent actionEvent) {
        Platform.exit();
    }


}