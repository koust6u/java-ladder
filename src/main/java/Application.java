import controller.LadderController;
import view.InputView;
import view.ResultView;

public class Application {

    public static void main(String[] args) {
        LadderController ladderController = new LadderController();
        ladderController.runLadderGame();
    }
}
