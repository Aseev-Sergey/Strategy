package sample.strategy;

import javafx.scene.layout.Pane;
import sample.Node;

public class ChangePosition implements Strategy {

    @Override
    public void chooseStrategy(Pane pane, Node node) {
        double width = pane.getWidth();
        double height = pane.getHeight();
        node.getNode().setX(Math.random()*width);
        node.getNode().setY(Math.random()*height);
        pane.getChildren().add(node.getNode());
    }
}
