package DevFoundry.Strukturalne.Adapter;

import DevFoundry.Strukturalne.Adapter.patternAdapter.*;

public class Main {

    public static void main(String[] args){

        ContinentalDevice radio = new ContinentalDevice(){
            public void on(){
                System.out.println("Gra muzyka");
            }
        };

        ContinentalSocket continentalSocket = new ContinentalSocket();

        continentalSocket.plugIn(radio);

        UKDevice ukRadio = new UKDevice(){
            public void powerOn(){
                System.out.println("London calling to the faraway towns\n");
            }
        };

        UKSocket ukSocket = new UKSocket();

        ukSocket.plugIn(ukRadio);

        UKToContinentalAdapter adapter = new UKToContinentalAdapter(ukRadio);

        continentalSocket.plugIn(adapter);

//---------------------------------------------------------------

        ContinentalDevice continentalRadio = new ContinentalDevice() {
            @Override
            public void on() {
                System.out.println("London calling to the underworld");
            }
        };

        TwoWayAdapter adapter2 = new TwoWayAdapter(ukRadio, continentalRadio);

        continentalSocket.plugIn(adapter2);
        ukSocket.plugIn(adapter2);
    }
}
