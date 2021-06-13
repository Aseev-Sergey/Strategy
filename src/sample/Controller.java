package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.layout.Pane;
import sample.strategy.Branch;
import sample.strategy.Context;
import sample.strategy.Cycle;
import sample.strategy.Linear;


public class Controller {

    public Pane pane;
    Context context;

    private void clearPane(){
        pane.getChildren().clear();
    }

    public void clickLinear(ActionEvent actionEvent) {
        clearPane();
        context = new Context(new Linear());
        context.buildScheme(pane);
    }

    public void clickBranch(ActionEvent actionEvent) {
        clearPane();
        context = new Context(new Branch());
        context.buildScheme(pane);
    }

    public void clickCycle(ActionEvent actionEvent) {
        clearPane();
        context = new Context((new Cycle()));
        context.buildScheme(pane);
    }

    public void clickClear(ActionEvent actionEvent) {
        clearPane();
    }

    public void clickClose(ActionEvent actionEvent) {
        Platform.exit();
    }
}