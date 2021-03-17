package StrefaKursow.Czynnosciowe.Strategia;

import StrefaKursow.Czynnosciowe.Strategia.strategy.*;

public class Main {

    public static void main(String[] args) {

        //Strategia zastępuje enuma / switch case z logiką

        Employee mike = new Employee();

        mike.travelStrategy = new BikeTravelStrategy();
        mike.jobStrategy = new DoctorJobStragegy();
        mike.breakfastStrategy = new SandwitchBreakfastStrategy();

        mike.goToWork();
        mike.doYourJob();
        mike.eatYourBreakfast(mike);

        mike.travelStrategy = new CarTravelStrategy();
        mike.goToWork();

    }
}
