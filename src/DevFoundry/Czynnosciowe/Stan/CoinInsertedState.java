package DevFoundry.Czynnosciowe.Stan;

public class CoinInsertedState implements State{

    @Override
    public void insertTheCoin(CoffeeMachine coffeeMachine) {
        System.out.println("Moneta została już wrzucona");
    }

    @Override
    public void pushTheButton(CoffeeMachine coffeeMachine) {
        System.out.println("Nalewam kawe");
        coffeeMachine.state = new CupFullState();
    }

    @Override
    public void takeTheCup(CoffeeMachine coffeeMachine) {
        System.out.println("Wcisnij guzik");
    }

    @Override
    public void returnTheCoin(CoffeeMachine coffeeMachine) {
        System.out.println("Zwracam monete");
        coffeeMachine.state = new NoCoinState();
    }
}
