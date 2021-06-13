package sample.strategy;

import javafx.scene.layout.Pane;


public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void buildScheme(Pane pane) {
        strategy.chooseStrategy(pane);
    }

}