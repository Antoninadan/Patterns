package ua.i.mail100.abstractfactory;

import ua.i.mail100.abstractfactory.factory.ElfSquadronFactory;
import ua.i.mail100.abstractfactory.factory.HumanSquadronFactory;
import ua.i.mail100.abstractfactory.model.Squadron;

public class AbstractFactoryRunner {
    public static void main(String[] args) {
        Squadron humanSquadron = new Squadron();
        HumanSquadronFactory humanSquadronFactory = new HumanSquadronFactory();
        humanSquadron.createSquadron(humanSquadronFactory);

        Squadron elfSquadron = new Squadron();
        elfSquadron.createSquadron(new ElfSquadronFactory());

    }
}
