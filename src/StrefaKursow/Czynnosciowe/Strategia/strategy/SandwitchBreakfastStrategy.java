package StrefaKursow.Czynnosciowe.Strategia.strategy;

public class SandwitchBreakfastStrategy implements BreakfastStrategy {
    @Override
    public void eatYourBreakfast(Employee employee) {
        System.out.println("Eat sandwitch");
    }
}
