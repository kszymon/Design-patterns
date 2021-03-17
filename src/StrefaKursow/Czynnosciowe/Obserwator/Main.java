package StrefaKursow.Czynnosciowe.Obserwator;

import StrefaKursow.Czynnosciowe.Obserwator.observers.ObservableTempValue;

import java.util.Observable;
import java.util.Observer;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        //obsługa interfejsu użykownika
        //obsługa zmian repozytorium
        //obsługiwać zmiany w czujnikach

        //NA PEWNO NIE odpytujemy obiektu obserowanego
        //obiekt obserowany powiadamia zainterowane obiekty o zmianie

        ObservableTempValue observableValue = new ObservableTempValue();

        observableValue.addObserver((observable, o) -> System.out.println("1 " + o.toString()));
        observableValue.addObserver((observable, o) -> System.out.println("2 " + o.toString()));

        while(true) {
            Thread.sleep(500);
            observableValue.setValue((int) (observableValue.getOldTemp()+Math.random()*6-2));
        }

    }
}
