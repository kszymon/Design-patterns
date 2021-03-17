package StrefaKursow.Kreacyjne.StatycznaMetodaWytwórcza;

import StrefaKursow.Kreacyjne.StatycznaMetodaWytwórcza.models.FamilyHouse;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args){

        // new House .setAdress .setFloorsNumber .setDoorsNumber .setWindowsNumber
        House house = new House.HouseBuilder()
                .setAdress("ul. Kursowa 2")
                .setFloorsNumber(2)
                .setDoorsNumber(5)
                .setWindowsNUmber(6)
                .build();

        //STATYCZNE METODY WYTWÓRCZE
        // from, of, valueOf, instanceOf
        boolean isTrue = true;
        Boolean.valueOf(isTrue); //new Boolean(isTrue);

        FamilyHouse familyHouse = FamilyHouse.from(house);
    }
}
