package StrefaKursow.Czynnosciowe.Strategia.strategy;

public class Employee implements TravelStrategy, JobStrategy, BreakfastStrategy {

    public TravelStrategy travelStrategy;
    public JobStrategy jobStrategy;
    public BreakfastStrategy breakfastStrategy;

    @Override
    public void eatYourBreakfast(Employee employee) {
        breakfastStrategy.eatYourBreakfast(employee);
    }

    @Override
    public void doYourJob() {
        jobStrategy.doYourJob();
    }

    @Override
    public void goToWork() {
        travelStrategy.goToWork();
    }
}
