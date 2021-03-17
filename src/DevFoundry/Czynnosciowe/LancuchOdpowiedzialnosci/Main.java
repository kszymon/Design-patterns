package DevFoundry.Czynnosciowe.LancuchOdpowiedzialnosci;

import DevFoundry.Czynnosciowe.LancuchOdpowiedzialnosci.message.Message;
import DevFoundry.Czynnosciowe.LancuchOdpowiedzialnosci.officer.*;

public class Main {

    public static void main(String[] args) {

        Message message = new Message("Atakować!", 100, OfficerRank.GERNERAL);

        Officer sergeant = new Sergeant();
        Officer captain = new Captain();
        Officer general = new General();

        sergeant.setSuperiorOfficer(captain);
        captain.setSuperiorOfficer(general);

        sergeant.processMessage(message);
    }
}
