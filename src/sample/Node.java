package sample;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Node {

    private Rectangle operation;

    public Node(){

        operation = new Rectangle(120, 60, Color.LIGHTGREY);
        operation.setArcHeight(50);
        operation.setArcWidth(50);
        operation.setX(140);
        operation.setY(30);
    }

    public Node(double startX, double startY, double width, double height){
        operation = new Rectangle(width, height, Color.LIGHTGREY);
        operation.setArcHeight(50);
        operation.setArcWidth(50);
        operation.setX(startX-width / 2.0);
        operation.setY(startY);
    }

    public Rectangle getNode() {
        return operation;
    }
}
