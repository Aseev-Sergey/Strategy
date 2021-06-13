package sample.strategy;

import javafx.scene.layout.Pane;
import sample.nodes.*;

public class Branch implements Strategy {

    private double x;
    private double y;
    private double r;
    private Begin begin;
    private Operation oper1, operLChose, operRChose;
    private Solution sol;
    private End end;
    private Arrows arrowBToOp1, arrowOp1ToSol, arrowSolToOpL, arrowSolToOpR, arrowOpLToE, arrowOpRToE;

    public Branch(){
        x = 195;
        y = 30;
        r = 20;
        begin = new Begin(x, y, r);
        oper1 = new Operation(x, y+50, 120, 60);
        sol = new Solution(x, y+160, 100);
        operLChose = new Operation(x-100, y+250, 120, 60);
        operRChose = new Operation(x+100, y+250, 120, 60);
        end = new End(x, y+380,r);
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
        arrowSolToOpL = new Arrows(new double[]{
                x-110, y+240,
                x-90, y+240,
                x-100, y+250
        }, new double[]{
                x-70, y+210, x-100, y+210,
                x-100, y+210, x-100, y+240
        });
        arrowSolToOpR = new Arrows(new double[]{
                x+90, y+240,
                x+110, y+240,
                x+100, y+250
        }, new double[]{
                x+70, y+210, x+100, y+210,
                x+100, y+210, x+100, y+240
        });
        arrowOpLToE = new Arrows(new double[]{
                x-10, y+350,
                x+10, y+350,
                x, y+360
        }, new double[]{
                x-100, y+310, x-100, y+330,
                x-100, y+330, x, y+330,
                x, y+330, x, y+350
        });
        arrowOpRToE = new Arrows(new double[]{

        },new double[]{
                x+100, y+310, x+100, y+330,
                x+100, y+330, x, y+330
        });
    }

    @Override
    public void chooseStrategy(Pane pane) {
        pane.getChildren().addAll(begin.getBegin(), oper1.getOperation(), operLChose.getOperation(),
                operRChose.getOperation(), sol.getSolution(), end.getOuter(), end.getInner(), end.getFilled(),
                arrowBToOp1.getArrow(), arrowOp1ToSol.getArrow(), arrowSolToOpL.getArrow(), arrowSolToOpR.getArrow(),
                arrowOpLToE.getArrow(), arrowOpRToE.getArrow());
        for (int index = 0; index < arrowBToOp1.getArrayLine().length; index++){
            pane.getChildren().add(arrowBToOp1.getArrowLine(index));
        }
        for (int index = 0; index < arrowOp1ToSol.getArrayLine().length; index++){
            pane.getChildren().add(arrowOp1ToSol.getArrowLine(index));
        }
        for (int index = 0; index < arrowSolToOpL.getArrayLine().length; index++){
            pane.getChildren().add(arrowSolToOpL.getArrowLine(index));
        }
        for (int index = 0; index < arrowSolToOpR.getArrayLine().length; index++){
            pane.getChildren().add(arrowSolToOpR.getArrowLine(index));
        }
        for (int index = 0; index < arrowOpLToE.getArrayLine().length; index++){
            pane.getChildren().add(arrowOpLToE.getArrowLine(index));
        }
        for (int index = 0; index < arrowOpRToE.getArrayLine().length; index++){
            pane.getChildren().add(arrowOpRToE.getArrowLine(index));
        }
    }
}
