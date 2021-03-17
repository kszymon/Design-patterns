package StrefaKursow.Kreacyjne.BudowniczyZStatycznaKlasaWewnetrzna;

public class Main {

    public static void main(String[] args){
        // new House .setAdress .setFloorsNumber .setDoorsNumber .setWindowsNumber
       House house = new House.HouseBuilder()
                .setAdress("ul. Kursowa 2")
                .setFloorsNumber(2)
                .setDoorsNumber(5)
                .setWindowsNUmber(6)
                .build();
    }
}
