package StrefaKursow.Czynnosciowe.Strategia.strategy;

public class CarTravelStrategy implements TravelStrategy {
    @Override
    public void goToWork() {
        System.out.println("Go by car");
    }
}
