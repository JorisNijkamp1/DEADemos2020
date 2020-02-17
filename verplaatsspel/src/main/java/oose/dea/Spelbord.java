package oose.dea;

import java.util.ArrayList;

public class Spelbord {
    private ArrayList<Vakje> vakjes = new ArrayList<Vakje>();

    public Spelbord() {
        maakVakjesAan();
    }

    private void maakVakjesAan() {
        for (int i = 0; i < 3; i++) {
            vakjes.add(new Vakje(i));
        }
    }

    public void plaatsOpVrijVakje(Karakter k) {
        Vakje v = kiesVrijVakje();

        if (v != null) {
            k.setVakje(v);
            System.out.println(k.getNaam() + " is geplaatst op een vrij vakje!");
        } else {
            System.out.println("Er zijn geen vrije vakjes meer!");
        }
    }

    public void teleporteer(Karakter k, int vaknr) {
        vakjes.forEach(v -> {
            if (vaknr == v.getVaknr()) {
                if (v.getKarakter() == null) {
                    v.setKarakter(k);
                    k.verminderEnergie();
                    v.clearVakje();
                } else {
                    System.out.println("Vakje " + vaknr + " is al bezet door een andere speler!");
                }
            }
        });
    }

    public void wisselVakje(Karakter k, int doelVak) {
        vakjes.forEach(vakje -> {
            if (doelVak == vakje.getVaknr()) {
                if (vakje.getKarakter() != null) {
                    if (k.getVakje().getVaknr() == doelVak) {
                        System.out.println("Je staat zelf al op dit vakje!");
                        return;
                    }

                    if (k.getEnergie() >= 20) {
                        Karakter huidigeSpeler = vakje.getKarakter();
                        huidigeSpeler.setVakje(k.getVakje());
                        k.setVakje(vakje);
                        k.verminderEnergie();
                        System.out.println(k.getNaam() + " is gewisseld, energie is: " + k.getEnergie());
                        System.out.println("------------");
                    } else {
                        System.out.println("speler heeft te weinig energie om te wisselen!");
                    }
                } else {
                    System.out.println("Op vakje " + doelVak + " staat geen speler!");
                }
            }
        });
    }

    private Vakje kiesVrijVakje() {
        System.out.println("Controleren of er nog een vrij vakje is...");
        Vakje v = null;
        for (Vakje vakje : vakjes) {
            if (vakje.getKarakter() == null) {
                v = vakje;
                break;
            }
        }
        return v;
    }
}
