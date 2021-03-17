package DevFoundry.Kreacyjne.FabrykaAbstrakcyjna.units;

public abstract class MechanizedUnit {

    private int hp;
    private int exp;
    private int dmpDone;

    protected MechanizedUnit(int hp, int exp, int dmpDone) {
        this.hp = hp;
        this.exp = exp;
        this.dmpDone = dmpDone;
    }

    public int getHp() {
        return hp;
    }

    public int getExp() {
        return exp;
    }

    public int getDmpDone() {
        return dmpDone;
    }
}
