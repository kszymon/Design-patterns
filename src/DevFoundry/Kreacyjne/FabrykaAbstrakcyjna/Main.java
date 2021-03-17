package DevFoundry.Kreacyjne.FabrykaAbstrakcyjna;

import DevFoundry.Kreacyjne.FabrykaAbstrakcyjna.units.*;

public class Main {

    public static void main(String[] args){

        Factory blueFactory = new BlueFactory();
        Factory redFactory = new RedFactory();

        MechanizedUnit redTank = redFactory.createMechanizedUnit(UnitType.TANK);
        InfantryUnit redInfanfry = redFactory.createInfantryUnit(UnitType.RIFLEMAN);

        MechanizedUnit blueTank = blueFactory.createMechanizedUnit(UnitType.TANK);
        InfantryUnit blueInfanfry = blueFactory.createInfantryUnit(UnitType.RIFLEMAN);

        AirUnit blueHelicopter = blueFactory.createAirUnit(UnitType.HELICOPTER);
        AirUnit redHelicopter = redFactory.createAirUnit(UnitType.HELICOPTER);
    }
}
