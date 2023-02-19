package org.example;

import java.util.ArrayList;
import java.util.Scanner;

class Pojisteny {
    private String jmeno;
    private String prijmeni;
    private int vek;
    private int telefonniCislo;

    public Pojisteny(String jmeno, String prijmeni, int vek, int telefonniCislo) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.telefonniCislo = telefonniCislo;
    }

    public String getJmeno() {
        return jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public int getVek() {
        return vek;
    }

    public int getTelefonniCislo() {
        return telefonniCislo;
    }

    @Override
    public String toString() {
        return jmeno + "\t" + prijmeni + "\t" + vek + "\t" + telefonniCislo;
    }
}
