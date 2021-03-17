package StrefaKursow.Strukturalne.Dekorator.dekorator;

public class SpecialBonus extends Bonus {
    public SpecialBonus(Payable payable) {
        super(payable);
    }

    @Override
    protected int getPaidBonus(int salary) {
        return 1000;
    }
}
