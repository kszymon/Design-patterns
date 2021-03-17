package StrefaKursow.Czynnosciowe.Strategia.strategy;

public class BikeTravelStrategy implements TravelStrategy {
    @Override
    public void goToWork() {
        System.out.println("Going by bike");
    }
}
