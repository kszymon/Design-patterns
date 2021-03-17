package StrefaKursow.Strukturalne.Adapter;

import StrefaKursow.Strukturalne.Adapter.adapter.OfficialTrippingEmployee;
import StrefaKursow.Strukturalne.Adapter.strategy.*;

public class Main {

    public static void main(String[] args){
        Employee mike = new Employee();

        mike.travelStrategy = new BikeTravelStrategy();
        mike.jobStrategy = new DoctorJobStragegy();
        mike.breakfastStrategy = new SandwitchBreakfastStrategy();

        mike.goToWork();
        mike.doYourJob();
        mike.eatYourBreakfast(mike);

        mike.travelStrategy = new CarTravelStrategy();
        mike.goToWork();

        OfficialTrippingEmployee otMike = new OfficialTrippingEmployee(mike);
        otMike.goToClient();
    }
}
