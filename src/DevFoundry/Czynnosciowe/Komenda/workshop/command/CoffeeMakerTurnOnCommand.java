package DevFoundry.Czynnosciowe.Komenda.workshop.command;

import DevFoundry.Czynnosciowe.Komenda.workshop.CoffeeMaker;

public class CoffeeMakerTurnOnCommand implements Command{

    private CoffeeMaker coffeeMaker;

    public CoffeeMakerTurnOnCommand(CoffeeMaker coffeeMaker){
        this.coffeeMaker = coffeeMaker;
    }

    @Override
    public void execute() {
        coffeeMaker.turnOn();
    }

    @Override
    public void undo() {
        coffeeMaker.turnOff();
    }
}
