package DevFoundry.Strukturalne.Pelnomocnik;

public class SavedGameProxy implements SavedGame {

    private String name;
    public SavedGame sg; //SavedGamedFull

    @Override
    public void initialize() {
        this.name = "Save Game - " + String.valueOf(System.currentTimeMillis());
    }

    @Override
    public void loadGame() {
        sg = new SavedGameFull();
        sg.initialize();
        sg.loadGame();
    }

    @Override
    public String getName() {
        return this.name;
    }
}
