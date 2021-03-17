package DevFoundry.Czynnosciowe.Strategia;

import DevFoundry.Czynnosciowe.Strategia.chef.Chef;
import DevFoundry.Czynnosciowe.Strategia.chef.egg_cooker.HardBoiledEggCooker;
import DevFoundry.Czynnosciowe.Strategia.chef.egg_cooker.SoftBoiledEggCooker;

public class Main {

    public static void main(String[] args) {

        //Nowe zamównie - jajka na twardo!
        Chef chef = new Chef("Gordon Gessler");
        chef.setEggCooker(new HardBoiledEggCooker());
        chef.cook();
        //Nowe zamównie - jajka na mięko!
        chef.setEggCooker(new SoftBoiledEggCooker());
        chef.cook();
    }
}
