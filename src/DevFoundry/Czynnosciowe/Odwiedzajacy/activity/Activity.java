package DevFoundry.Czynnosciowe.Odwiedzajacy.activity;

import DevFoundry.Czynnosciowe.Odwiedzajacy.visitor.Visitor;

public interface Activity {

    void accept(Visitor visitor);
}
