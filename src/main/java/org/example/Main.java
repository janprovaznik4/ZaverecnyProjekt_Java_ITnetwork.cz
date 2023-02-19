package org.example;

import java.util.Scanner;
//PŘIDAT NA VSTUPECH TRIM
public class Main {
    public static void main(String[] args) {
        Pojistovna pojistovna = new Pojistovna();
        Scanner sc = new Scanner(System.in);
        int volba = 0;
        String vstupJmeno;
        String vstupPrijmeni;
        int vstupVek;
        int vstupTelefonníCislo;

        while (volba != 4) {
            System.out.println("\nVyberte si akci:");
            System.out.println("1 - Přidat nového pojištěného");
            System.out.println("2 - Vypsat všechny pojištěné");
            System.out.println("3 - Vyhledat pojištěného");
            System.out.println("4 - Konec");
            System.out.println("=============================");

            try {
                volba = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Toto není platná volba.");
            }

            switch (volba) {
                case 1:
                    System.out.println("Zadejte křestní jméno nového pojištěného:");
                    vstupJmeno = sc.nextLine();
                    System.out.println("Zadejte příjmení:");
                    vstupPrijmeni = sc.nextLine();
                    System.out.println("Zadejte věk:");
                    try {
                        vstupVek = Integer.parseInt(sc.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Toto není číselný vstup. Zadejte pojištěného znovu.");
                        break;
                    }
                    System.out.println("Zadejte telefonní číslo:");
                    try {
                        vstupTelefonníCislo = Integer.parseInt(sc.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Toto není číselný vstup. Zadejte pojištěného znovu.");
                        break;
                    }
                    pojistovna.pridatPojisteneho(new Pojisteny(vstupJmeno, vstupPrijmeni, vstupVek, vstupTelefonníCislo));
                break;
                case 2:
                    pojistovna.vypisPojistene();
                break;
                case 3:
                    System.out.println("Zadejte křestní jméno hledaného pojištěného:");
                    vstupJmeno = sc.nextLine();
                    System.out.println("Zadejte příjmení:");
                    vstupPrijmeni = sc.nextLine();
                    Pojisteny pomPojisteny = pojistovna.vyhledatPojistene(vstupJmeno, vstupPrijmeni);
                    if (pomPojisteny == null) {
                        System.out.println("Takového pojištěného u nás neevidujeme.");
                    } else {
                        System.out.println("Výpis nalezených pojištěných dle zadaného jména a příjmení:");
                        System.out.println(pomPojisteny);
                    }
                break;
                case 4:
                    System.out.println("Děkujeme za použití aplikace. Hezký den!");
                    return;
                default:
                    System.out.println("Zadejte číslici 1-4.\n");
            }
        }
    }
}