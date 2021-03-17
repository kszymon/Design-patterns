package DevFoundry.Strukturalne.Fasada;

import DevFoundry.Strukturalne.Fasada.DeliveryBox.DeliveryBoxFacade;

public class Main {

    public static void main(String[] args) {

        DeliveryBoxFacade deliveryBoxFacade = new DeliveryBoxFacade();
        deliveryBoxFacade.pickupPackage();
    }
}
