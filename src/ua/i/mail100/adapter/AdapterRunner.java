package ua.i.mail100.adapter;

import ua.i.mail100.adapter.adapter.SquarePegAdapter;
import ua.i.mail100.adapter.clientinterface.RoundHole;
import ua.i.mail100.adapter.clientinterface.RoundPeg;
import ua.i.mail100.adapter.outerservice.SquarePeg;

//https://refactoring.guru/uk/design-patterns/adapter/java/example
public class AdapterRunner {
    public static void main(String[] args) {
        // Round fits round, no surprise.
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);
        if (hole.fits(rpeg)) {
            System.out.println("Round peg with radius " + rpeg.getRadius() +
                    " fits round hole with radius " + hole.getRadius());
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);
        // hole.fits(smallSqPeg); // Won't compile.

        // Adapter solves the problem.
        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);
        if (hole.fits(smallSqPegAdapter)) {
            System.out.println("Square peg with radius " + smallSqPegAdapter.getRadius() +
                    " fits round hole with radius " + hole.getRadius());
        }
        if (!hole.fits(largeSqPegAdapter)) {
            System.out.println("Square peg with radius " + largeSqPegAdapter.getRadius() +
                    " NOT fits round hole with radius " + hole.getRadius());
        }
    }
}
