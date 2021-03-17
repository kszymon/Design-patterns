package StrefaKursow.Strukturalne.Fasada.database;


import StrefaKursow.Strukturalne.Fasada.strategy.BikeTravelStrategy;
import StrefaKursow.Strukturalne.Fasada.strategy.DoctorJobStragegy;
import StrefaKursow.Strukturalne.Fasada.strategy.Employee;
import StrefaKursow.Strukturalne.Fasada.strategy.SandwitchBreakfastStrategy;

public class EmployeeCreator {

    public static final String BIKE_DOCTOR_SANDWICH = "bikeDoctorSandwich";

    public Employee create(String employeeType) {
        switch (employeeType) {
            case BIKE_DOCTOR_SANDWICH:
                {
                Employee mike = new Employee();

                mike.travelStrategy = new BikeTravelStrategy();
                mike.jobStrategy = new DoctorJobStragegy();
                mike.breakfastStrategy = new SandwitchBreakfastStrategy();
                return mike;
            }
            default: return new Employee();
        }
    }

}
