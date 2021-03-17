package DevFoundry.Czynnosciowe.MetodaSzablonowa.templateMethod;

public abstract class CarStartingSequence {

    public final void startTheCar(){
        fastenSeatbelts();
        startTheIgnition();
        setTheGear();
        go();
    }

    private void go() {
        System.out.println("Wciskamy pedał gazu");
    }

    private void fastenSeatbelts() {
        System.out.println("Zapinamy pasy");
    }

    public abstract void startTheIgnition();
    public abstract void setTheGear();
}
