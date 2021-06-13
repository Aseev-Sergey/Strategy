package sample.strategy;

import javafx.scene.layout.Pane;
import sample.nodes.*;

public class Cycle implements Strategy {

    private double x;
    private double y;
    private double r;
    private Begin begin;
    private Operation oper1, operIn;
    private Solution solCycle;
    private End end;
    private Arrows arrowBToOp1, arrowOp1ToSol, arrowSolToIn, arrowInToSol, arrowSolToE;

    public Cycle(){
        x = 195;
        y = 30;
        r = 20;
        begin = new Begin(x, y, r);
        oper1 = new Operation(x,y+50,120, 60);
        operIn = new Operation(x, y+310, 120, 60);
        solCycle = new Solution(x, y+160, 100);
        end = new End(x, y+450, r);
        arrowBToOp1 = new Arrows(new double[]{
                x-10, y+40,
                x+10, y+40,
                x, y+50
        }, new double[]{
                x, y+20, x, y+40
        });
        arrowOp1ToSol = new Arrows(new double[]{
                x-10, y+130,
                x+10, y+130,
                x, y+140
        }, new double[]{
                x, y+110, x, y+130
        });
        arrowSolToIn = new Arrows(new double[]{
                x-10, y+300,
                x+10, y+300,
                x, y+310
        }, new double[]{
                x, y+280, x, y+300
        });
        arrowInToSol = new Arrows(new double[]{
                x-80, y+200,
                x-80, y+220,
                x-70, y+210
        }, new double[]{
                x, y+370, x, y+390,
                x, y+390, x-90, y+390,
                x-90, y+390, x-90,y+210,
                x-90, y+210, x-80, y+210
        });
        arrowSolToE = new Arrows(new double[]{
                x-10, y+420,
                x+10, y+420,
                x, y+430
        }, new double[]{
                x+70, y+210, x+90, y+210,
                x+90, y+210, x+90, y+400,
                x+90, y+400, x, y+400,
                x, y+400, x, y+420
        });
    }

    @Override
    public void chooseStrategy(Pane pane) {
        pane.getChildren().addAll(begin.getBegin(), oper1.getOperation(), solCycle.getSolution(),
                operIn.getOperation(), end.getOuter(), end.getInner(), end.getFilled(),
                arrowBToOp1.getArrow(), arrowOp1ToSol.getArrow(), arrowSolToIn.getArrow(),
                arrowInToSol.getArrow(), arrowSolToE.getArrow());
        for (int index = 0; index < arrowBToOp1.getArrayLine().length; index++){
            pane.getChildren().add(arrowBToOp1.getArrowLine(index));
        }
        for (int index = 0; index < arrowOp1ToSol.getArrayLine().length; index++){
            pane.getChildren().add(arrowOp1ToSol.getArrowLine(index));
        }
        for (int index = 0; index < arrowSolToIn.getArrayLine().length; index++){
            pane.getChildren().add(arrowSolToIn.getArrowLine(index));
        }
        for (int index = 0; index < arrowInToSol.getArrayLine().length; index++){
            pane.getChildren().add(arrowInToSol.getArrowLine(index));
        }
        for (int index = 0; index < arrowSolToE.getArrayLine().length; index++){
            pane.getChildren().add(arrowSolToE.getArrowLine(index));
        }
    }
}
