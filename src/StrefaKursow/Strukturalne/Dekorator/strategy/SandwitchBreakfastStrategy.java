package StrefaKursow.Strukturalne.Dekorator.strategy;

public class SandwitchBreakfastStrategy implements BreakfastStrategy {
    @Override
    public void eatYourBreakfast(Employee employee) {
        System.out.println("Eat sandwitch");
    }
}
