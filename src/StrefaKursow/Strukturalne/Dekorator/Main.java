package StrefaKursow.Strukturalne.Dekorator;

import StrefaKursow.Strukturalne.Dekorator.adapter.OfficialTrippingEmployee;
import StrefaKursow.Strukturalne.Dekorator.dekorator.DeadlineBonus;
import StrefaKursow.Strukturalne.Dekorator.dekorator.FreqBonus;
import StrefaKursow.Strukturalne.Dekorator.dekorator.Payable;
import StrefaKursow.Strukturalne.Dekorator.dekorator.SpecialBonus;
import StrefaKursow.Strukturalne.Dekorator.strategy.*;

public class Main {

    public static void main(String[] args){
        Employee mike = new Employee();
        mike.setSalary(10000);

        mike.travelStrategy = new BikeTravelStrategy();
        mike.jobStrategy = new DoctorJobStragegy();
        mike.breakfastStrategy = new SandwitchBreakfastStrategy();

        mike.goToWork();
        mike.doYourJob();
        mike.eatYourBreakfast(mike);

        mike.travelStrategy = new CarTravelStrategy();
        mike.goToWork();

       // OfficialTrippingEmployee otMike = new OfficialTrippingEmployee(mike);
        //otMike.goToClient();

        System.out.println("zarobki " + mike.getSalary());
       // System.out.println("zarobki " + new FreqBonus(new DeadlineBonus(new SpecialBonus(mike)))).getSalary();

        Payable employee = mike;
        if(mike.getSalary()>8000){
            employee = new SpecialBonus(employee);
        }
        if(mike.travelStrategy instanceof BikeTravelStrategy){
            employee = new FreqBonus(employee);
        }

        System.out.println("zarobki " + employee.getSalary());
    }
}
