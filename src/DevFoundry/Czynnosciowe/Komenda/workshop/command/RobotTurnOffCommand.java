package DevFoundry.Czynnosciowe.Komenda.workshop.command;

import DevFoundry.Czynnosciowe.Komenda.workshop.Robot;

public class RobotTurnOffCommand implements Command {

    private Robot robot;

    public RobotTurnOffCommand(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void execute() {
        robot.turnOff();
    }

    @Override
    public void undo() {
        robot.turnOn();
    }
}
