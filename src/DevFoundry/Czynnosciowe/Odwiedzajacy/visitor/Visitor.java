package DevFoundry.Czynnosciowe.Odwiedzajacy.visitor;

import DevFoundry.Czynnosciowe.Odwiedzajacy.activity.Squash;
import DevFoundry.Czynnosciowe.Odwiedzajacy.activity.Treadmill;
import DevFoundry.Czynnosciowe.Odwiedzajacy.activity.Weights;

public interface Visitor {

    void visit(Treadmill treadmill);
    void visit(Squash squash);
    void visit(Weights weights);
}
