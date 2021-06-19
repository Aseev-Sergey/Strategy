package sample.strategy;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import sample.Node;

public class AddArrow implements Strategy {
    @Override
    public void chooseStrategy(Pane pane, Node node) {
        double startX = node.getNode().getX()+node.getNode().getWidth()/2.0;
        double startY = node.getNode().getY()+node.getNode().getHeight();
        double endX = startX;
        double endY = startY + 30;
        Line line = new Line(startX, startY, endX, endY);
        Polygon arrowHead = new Polygon(new double[]{
                endX-10, endY,
                endX+10, endY,
                endX, endY+10
        });
        pane.getChildren().addAll(node.getNode(), line, arrowHead);
    }
}
