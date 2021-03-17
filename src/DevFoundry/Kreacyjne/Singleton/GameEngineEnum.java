package DevFoundry.Kreacyjne.Singleton;

public enum GameEngineEnum {
// Enum chroni przed przypadkowy upubliczeniem konstruktora klasy singleton i utowrzeniu w kodzie wielie instacji Singletona.
// Implematacja enumowa z samej defincji chroni przed wieloktkowścią, serializacją, refleksją i class loader

    INSTANCE("Duke");

    private int hp = 100;
    private String characterName = "";

    private GameEngineEnum(String name){
        this.characterName = name;
    }

    public void run(){
        while(true){
            //czekamy na input gracza
            // zmieniamy stan gry
            // renderujemy grafike
        }
    }
}
