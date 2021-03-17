package DevFoundry.Kreacyjne.BudowniczyKlasyczny;

import DevFoundry.Kreacyjne.BudowniczyKlasyczny.house.BigHouseBuilder;
import DevFoundry.Kreacyjne.BudowniczyKlasyczny.house.House;
import DevFoundry.Kreacyjne.BudowniczyKlasyczny.house.HouseDirector;
import DevFoundry.Kreacyjne.BudowniczyKlasyczny.house.SmallHouseBuilder;

public class Main {

    public static void main(String[] args) {

//        House house1 = new House("walls", "floors", "rooms", "windows", "doors", "garage");
//        House house2 = new House("")

        SmallHouseBuilder smallHouseBuilder = new SmallHouseBuilder();
        BigHouseBuilder bigHouseBuilder = new BigHouseBuilder();

        HouseDirector smallHouseDirector = new HouseDirector(smallHouseBuilder);
        smallHouseDirector.buildHouse();

        HouseDirector bigHouseDirector = new HouseDirector(bigHouseBuilder);
        bigHouseDirector.buildHouse();

        House smallHouse = smallHouseDirector.getHouse();
        House bigHouse = bigHouseDirector.getHouse();

        System.out.println(smallHouse);
        System.out.println(bigHouse);

    }

}
