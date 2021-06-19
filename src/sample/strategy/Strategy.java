package sample.strategy;


import javafx.scene.layout.Pane;
import sample.Node;

public interface Strategy {
    public void chooseStrategy(Pane pane, Node node);


}