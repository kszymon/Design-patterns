package StrefaKursow.Strukturalne.Dekorator.adapter;

import StrefaKursow.Strukturalne.Adapter.strategy.Employee;
import StrefaKursow.Strukturalne.Dekorator.dekorator.Payable;

public class OfficialTrippingEmployee {

    private Employee employee;

    public OfficialTrippingEmployee(Employee employee) {
        this.employee = employee;
    }

    public void goToClient() {
        employee.goToWork();
        System.out.println("to client");
    }
}
