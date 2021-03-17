package DevFoundry.Czynnosciowe.Komenda.workshop.command;

import DevFoundry.Czynnosciowe.Komenda.workshop.Robot;

public class RobotTurnOnCommand implements Command{

    private Robot robot;

    public RobotTurnOnCommand(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void execute() {
        robot.turnOn();
    }

    @Override
    public void undo() {
        robot.turnOff();
    }
}
