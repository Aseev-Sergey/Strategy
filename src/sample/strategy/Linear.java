package sample.strategy;

import javafx.scene.layout.Pane;
import sample.nodes.*;

public class Linear implements Strategy {

    private double x;
    private double y;
    private double r;
    private Operation oper1, oper2;
    private Begin begin;
    private End end;
    private Arrows arrowBToOp1, arrowOp1ToOp2, arrowOp2ToE;

    public Linear(){
        x = 195;
        y = 30;
        r = 20;
        begin = new Begin(x, y, r);
        oper1 = new Operation(x,y+50,120, 60);
        oper2 = new Operation(x, y+140, 120, 60);
        end = new End(x,y+250,r);
        arrowBToOp1 = new Arrows(new double[]{
                x-10, y+40,
                x+10, y+40,
                x, y+50
        }, new double[]{
                x, y+20, x, y+40
        });
        arrowOp1ToOp2 = new Arrows(new double[]{
                x-10, y+130,
                x+10, y+130,
                x, y+140
        }, new double[]{
                x, y+110, x, y+130
        });
        arrowOp2ToE = new Arrows(new double[]{
                x-10, y+220,
                x+10, y+220,
                x, y+230
        }, new double[]{
                x,y+200, x, y+220
        });
    }


    @Override
    public void chooseStrategy(Pane pane) {
        pane.getChildren().addAll(begin.getBegin(), arrowBToOp1.getArrow(), oper1.getOperation(),
                arrowOp1ToOp2.getArrow(), oper2.getOperation(), arrowOp2ToE.getArrow(),
                end.getOuter(), end.getInner(), end.getFilled());
        for (int index = 0; index < arrowBToOp1.getArrayLine().length; index++){
            pane.getChildren().add(arrowBToOp1.getArrowLine(index));
        }
        for (int index = 0; index < arrowOp1ToOp2.getArrayLine().length; index++){
            pane.getChildren().add(arrowOp1ToOp2.getArrowLine(index));
        }
        for (int index = 0; index < arrowOp2ToE.getArrayLine().length; index++){
            pane.getChildren().add(arrowOp2ToE.getArrowLine(index));
        }
    }
}
