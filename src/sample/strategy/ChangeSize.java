package sample.strategy;

import javafx.scene.layout.Pane;
import sample.Node;

public class ChangeSize implements Strategy {
    @Override
    public void chooseStrategy(Pane pane, Node node) {
        double width = node.getNode().getWidth();
        double height = node.getNode().getHeight();
        node.getNode().setWidth(width + Math.random()*20-10);
        node.getNode().setHeight(height + Math.random()*20-10);
        pane.getChildren().add(node.getNode());
    }
}
