package StrefaKursow.Strukturalne.Fasada;

import StrefaKursow.Strukturalne.Fasada.strategy.Employee;

public class Main {

    public static void main(String[] args){

        ApiFacade facade = new ApiFacade();
        Employee mike = facade.createDoctor(10000);
        facade.pushDoctorToJob(mike);
        System.out.println("zarobki " + facade.countSalary(mike));
        facade.giveFreeHouseToBestFreqEmployee(mike);
    }

    private static void giveFreeHouseToBestFreqEmployee(){
        //todo
    }
}
