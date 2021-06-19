package sample.strategy;

import javafx.scene.layout.Pane;
import sample.Node;


public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void doChanges(Pane pane, Node node) {
        strategy.chooseStrategy(pane, node);
    }

}