package StrefaKursow.Strukturalne.Fasada;


import StrefaKursow.Strukturalne.Fasada.database.EmployeeCreator;
import StrefaKursow.Strukturalne.Fasada.database.EmployeeDatabase;
import StrefaKursow.Strukturalne.Fasada.dekorator.FreqBonus;
import StrefaKursow.Strukturalne.Fasada.dekorator.Payable;
import StrefaKursow.Strukturalne.Fasada.dekorator.SpecialBonus;
import StrefaKursow.Strukturalne.Fasada.strategy.BikeTravelStrategy;
import StrefaKursow.Strukturalne.Fasada.strategy.CarTravelStrategy;
import StrefaKursow.Strukturalne.Fasada.strategy.Employee;

public class ApiFacade {

    private EmployeeDatabase eDatabase = new EmployeeDatabase();
    private EmployeeCreator employeeCreator = new EmployeeCreator();

    public Employee createDoctor(int i) {
        Employee mike = employeeCreator.create(EmployeeCreator.BIKE_DOCTOR_SANDWICH);
        mike.setSalary(i);
        //eDatabase.addEmployee(mike);
        return mike;
    }

    public void pushDoctorToJob(Employee mike) {
        mike.goToWork();
        mike.doYourJob();
        mike.eatYourBreakfast(mike);

        mike.travelStrategy = new CarTravelStrategy();
        mike.goToWork();
    }

    public int countSalary(Employee mike) {
        Payable employee = mike;
        if(mike.getSalary()>8000){
            employee = new SpecialBonus(employee);
        }
        if(mike.travelStrategy instanceof BikeTravelStrategy){
            employee = new FreqBonus(employee);
        }
        return employee.getSalary();
    }

    public void giveFreeHouseToBestFreqEmployee(Employee mike) {
        System.out.println("Nowy dom");
//        System.out.println(mike.toString()+" dostaje dom " + new House.HouseBuilder()
//                .setAdress("ul. Szkolna 2")
//                .setDoorsNumber(3)
//                .setWindowsNumber(10)
//                .build().toString());
    }
}
