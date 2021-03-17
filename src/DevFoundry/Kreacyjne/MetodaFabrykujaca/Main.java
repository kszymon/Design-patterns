package DevFoundry.Kreacyjne.MetodaFabrykujaca;

import DevFoundry.Kreacyjne.MetodaFabrykujaca.units.*;

public class Main {

    public static void main(String[] args){

        Factory factory = new UnitFactory();

        Unit tank = factory.createUnit(UnitType.TANK);
        Unit infantryman = factory.createUnit(UnitType.RIFLEMAN);

        System.out.println(tank);
        System.out.println(infantryman);

        //InfantryUnit tank2 = new Tank(200, 0, 20);
        //InfantryUnit infantryman2 = new Rifleman(100,0,10);
    }
}
