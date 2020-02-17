package oose.dea;

public class Console {
    public static void main(String[] args) {
        Spel spel = new Spel();
        spel.meldAan("Joris");
//        spel.meldAan("Harry");

        spel.teleporteer("Joris", 2);
        spel.teleporteer("Joris", 1);
        spel.teleporteer("Joris", 0);
        spel.teleporteer("Joris", 1);
//        spel.wisselVakje("Joris", 1);

//        spel.teleporteer("Harry", 0);
//        spel.wisselVakje("Harry", 2);
    }
}
