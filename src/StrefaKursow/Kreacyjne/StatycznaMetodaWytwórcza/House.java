package StrefaKursow.Kreacyjne.StatycznaMetodaWytwórcza;

public class House {

    private String adress;
    private Integer floorsNumber;
    private Integer doorsNumber;
    private Integer windowsNUmber;

    private House(String adress, Integer floorsNumber, Integer doorsNumber, Integer windowsNUmber) {
        this.adress = adress;
        this.floorsNumber = floorsNumber;
        this.doorsNumber = doorsNumber;
        this.windowsNUmber = windowsNUmber;
    }

    public static class HouseBuilder {
        private String adress;
        private Integer floorsNumber = 1;  //Wartości domyślne
        private Integer doorsNumber = 1;
        private Integer windowsNUmber = 4;

        public HouseBuilder setAdress(String adress) {
            this.adress = adress;
            return this;
        }

        public HouseBuilder setFloorsNumber(Integer floorsNumber) {
            this.floorsNumber = floorsNumber;
            return this;
        }

        public HouseBuilder setDoorsNumber(Integer doorsNumber) {
            this.doorsNumber = doorsNumber;
            return this;
        }

        public HouseBuilder setWindowsNUmber(Integer windowsNUmber) {
            this.windowsNUmber = windowsNUmber;
            return this;
        }

        public House build() {
            return new House(adress, floorsNumber, doorsNumber, windowsNUmber);
        }
    }

    public String getAdress() {
        return adress;
    }

    public Integer getFloorsNumber() {
        return floorsNumber;
    }

    public Integer getDoorsNumber() {
        return doorsNumber;
    }

    public Integer getWindowsNUmber() {
        return windowsNUmber;
    }
}
