package DevFoundry.Kreacyjne.Singleton;

import java.io.Serializable;

public class GameEngine implements Serializable {

    private static final long serialVersionUID = 5090947730417770300L;

    private int hp = 100;
    private String characterName = "";

    private static GameEngine instance = new GameEngine();

    private GameEngine(){

    }

    public void run(){
        while(true){
            //czekamy na input gracza
            // zmieniamy stan gry
            // renderujemy grafike
        }
    }

    //DevFoundry.Kreacyjne.Singleton jednowątkowy
//    public static GameEngine getInstance(){
//        if(instance==null){
//            instance = new GameEngine();
//        }
//        return instance;
//    }

    //DevFoundry.Kreacyjne.Singleton wielowątkowy
//    public static GameEngine getInstance(){
//        if(instance==null){
//
//            synchronized (GameEngine.class)
//            {
//                if(instance==null) {
//                    instance = new GameEngine();
//                }
//            }
//        }
//        return instance;
//    }

    public static GameEngine getInstance(){
        return instance;
    }

    //Uruchamia się po każdej deserializacji i chroni singleton przed wielokrotnym powieleniem.
    protected Object readResolve(){
        return getInstance();
    }


}
