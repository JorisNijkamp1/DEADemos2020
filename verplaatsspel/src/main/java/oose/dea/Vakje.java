package oose.dea;

public class Vakje {
    private Karakter karakter;
    private int vaknr;

    public Vakje(int vaknr) {
        this.vaknr = vaknr;
    }

    public void setKarakter(Karakter karakter) {
        System.out.println(karakter.getNaam() +
                " is geteleporteerd naar " +
                vaknr + ", energie is nu " +
                karakter.getEnergie());
        this.karakter = karakter;
    }

    public Karakter getKarakter() {
        return karakter;
    }

    public int getVaknr() {
        return vaknr;
    }

    public void clearVakje() {
        this.karakter = null;
    }
}
