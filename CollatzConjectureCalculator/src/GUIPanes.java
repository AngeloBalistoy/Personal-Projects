import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

import java.util.HashMap;

/**
 * A GUIPaneMap contains a hashmap of all the panes for the CollatzConjectureCalculator GUI.
 */
public class GUIPanes {
    private BorderPane[] panes = new BorderPane[3];

    public GUIPanes() {
        PaneBuilder pb = new PaneBuilder();
        this.panes[0] = pb.getOpeningPane();
        this.panes[1] = pb.getExplanationPane();
        this.panes[2] = pb.getCalculatePane();
    }

    public BorderPane getOpeningPane() {
        return this.panes[0];
    }

    public BorderPane getExplanationPane() {
        return this.panes[1];
    }

    public BorderPane getCalculatePane() {
        return this.panes[2];
    }
}
