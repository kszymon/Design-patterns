package DevFoundry.Czynnosciowe.Obserwator.order;

import DevFoundry.Czynnosciowe.Obserwator.notification.Observer;

public interface Observable {

    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifyObservers();
}
