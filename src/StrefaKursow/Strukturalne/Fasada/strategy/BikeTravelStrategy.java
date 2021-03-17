package StrefaKursow.Strukturalne.Fasada.strategy;

public class BikeTravelStrategy implements TravelStrategy {
    @Override
    public void goToWork() {
        System.out.println("Going by bike");
    }
}
