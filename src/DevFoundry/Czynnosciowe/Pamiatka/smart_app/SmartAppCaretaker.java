package DevFoundry.Czynnosciowe.Pamiatka.smart_app;

import java.util.ArrayList;
import java.util.List;

public class SmartAppCaretaker {

    private List<SmartAppMemento> mementos = new ArrayList<SmartAppMemento>();

    public void addMemento(SmartAppMemento smartAppMemento){
        mementos.add(smartAppMemento);
        System.out.println("Zapisano wersja: " + smartAppMemento.getVersion() + " znaduje się pod indeksem " + (mementos.size() - 1));
    }

    public SmartAppMemento getMemento(int index){
        System.out.println("Wczytaj wersję: " + mementos.get(index).getVersion());
        return mementos.get(index);
    }
}
