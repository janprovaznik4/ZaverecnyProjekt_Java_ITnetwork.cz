package org.example;

import java.util.ArrayList;
import java.util.List;

public class Pojistovna {
    private List<Pojisteny> seznamPojistenych;

    public Pojistovna() {
        seznamPojistenych = new ArrayList<>();
    }

    public void pridatPojisteneho(Pojisteny pojisteny) {
        seznamPojistenych.add(pojisteny);
    }

    public void vypisPojistene() {
        if (seznamPojistenych.isEmpty())
            System.out.print("Zatím neevidujeme žádné pojištěné.");
        else
            System.out.println("Výpis pojištěných:");
        for (Pojisteny pojisteny : seznamPojistenych) {
            System.out.println(pojisteny);
        }
    }

    public Pojisteny vyhledatPojistene(String jmeno, String prijmeni) {
        for (Pojisteny pojisteny : seznamPojistenych) {
            if (pojisteny.getJmeno().equals(jmeno) && pojisteny.getPrijmeni().equals(prijmeni)) {
                return pojisteny;
            }
        }
        return null;
    }
}
