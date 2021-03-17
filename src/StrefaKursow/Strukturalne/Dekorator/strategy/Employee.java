package StrefaKursow.Strukturalne.Dekorator.strategy;

import StrefaKursow.Strukturalne.Dekorator.dekorator.Payable;

public class Employee implements TravelStrategy, JobStrategy, BreakfastStrategy, Payable {

    private int salary = 0;

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

    @Override
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
