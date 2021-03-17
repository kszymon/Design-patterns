package StrefaKursow.Kreacyjne.BudowniczyZwykly;

public class House {

    private String adress;
    private Integer floorsNumber;
    private Integer doorsNumber;
    private Integer windowsNUmber;

    public House(String adress, Integer floorsNumber, Integer doorsNumber, Integer windowsNUmber) {
        this.adress = adress;
        this.floorsNumber = floorsNumber;
        this.doorsNumber = doorsNumber;
        this.windowsNUmber = windowsNUmber;
    }

    public House setAdress(String adress) {
        this.adress = adress;
        return this;
    }

    public House setFloorsNumber(Integer floorsNumber) {
        this.floorsNumber = floorsNumber;
        return this;
    }

    public House setDoorsNumber(Integer doorsNumber) {
        this.doorsNumber = doorsNumber;
        return this;
    }

    public House setWindowsNUmber(Integer windowsNUmber) {
        this.windowsNUmber = windowsNUmber;
        return this;
    }

    public House() {
    }

    public House createHouse(){
        return new House(adress, floorsNumber, doorsNumber, windowsNUmber);
    }
}
