package StrefaKursow.Kreacyjne.BudowniczyZwykly;

public class Main {

    public static void main(String[] args){

        // new House .setAdress .setFloorsNumber .setDoorsNumber .setWindowsNumber
        House house = new House()
                .setAdress("ul. Kursowa 2")
                .setFloorsNumber(2)
                .setDoorsNumber(5)
                .setWindowsNUmber(6)
                .createHouse();

    }
}
