package com.company;
import java.util.Scanner;
public class TehtavaViisi {

    public static void main(String[] args) {
        Scanner skanneri = new Scanner(System.in);
        System.out.println("Anna merkit");
        String muuttuja = skanneri.nextLine();
        System.out.println("Anna sijainti");
        int kokonaisluku = skanneri.nextInt();
        char merkki = naytaMerkki(muuttuja, kokonaisluku);
        System.out.println("Merkki paikassa " + kokonaisluku + " on " + merkki);
    }

    public static char naytaMerkki(String muuttuja, int kokonaisluku) {
        char merkki = muuttuja.charAt(kokonaisluku);
        if(Character.isLetter(merkki)) {
            System.out.println("merkki on kirjain");
        }
        if (Character.isUpperCase(merkki)) {
            System.out.println("merkki on iso kirjain");
        }

        if (Character.isLowerCase(merkki)) {
            System.out.println("merkki on pieni kirjain");
        }
        if (Character.isDigit(merkki)) {
            System.out.println("merkki on numero");
        }
        return merkki;

    }



}
