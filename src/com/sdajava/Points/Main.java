package com.sdajava.Points;

import java.util.Random;
import java.util.Scanner;

import static java.lang.System.exit;

public class Main {

    public static void main(String[] args) {

        int[][] statki = new int[10][10];
        int[][] trafienia = new int[10][10];
        int szerokosc, wysokosc, punkty = 0;
        //Wyświetlam pełna tablice taka dla wyglądu
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                System.out.print(" - ");
            }
            System.out.println("");
        }
        //pełna tablica losowanie pozycji statków!!!
        for (int k = 0; k <= 9; k++) {
            for (int l = 0; l <= 9; l++) {
                //losujemy czy w tablicy jest statek czy nie :P
                Random rand = new Random(); // tworze generator  zakres 1 - 4
                int Statek = rand.nextInt(3); //losowo  maja wartość od 0 do 5,
                statki[k][l] = Statek; // 0 to statek
            }
            System.out.println("");
        }
        while (punkty < 5) { //za każdy nietrafiony statek lub trafione 5 koniec
            System.out.println("Podaj pozycje statku!!!\nPodaj szerokość 0 - 9: ");
            Scanner in = new Scanner(System.in);
            szerokosc = in.nextInt();

            System.out.println("Podaj wysokość 0 - 9: ");
            wysokosc = in.nextInt();

            if (statki[wysokosc][szerokosc] == 1) {
                punkty++;
                int a = wysokosc;
                int b = szerokosc;
                trafienia[wysokosc][szerokosc] = 1;
                System.out.println("Trafiony!!!!");

                for (int m = 0; m <= 9; m++) {
                    for (int n = 0; n <= 9; n++) {
                        if ((trafienia[m][n] == 1)) {
                            System.out.print("<O>");

                        }
                        if (trafienia[m][n] != 1) {
                            System.out.print(" - ");
                        }
                    }
                    System.out.println("");
                }
            }
            if (statki[wysokosc][szerokosc] != 1) {
                System.out.println("Pudło!!!\nKombinuj dalej!!!");
            }
        }
        System.out.println("Wygrałeś!!!\nZdobyłes dziesięć punktów!!!");
        for (int o = 0; o <= 9; o++) {
            for (int p = 0; p <= 9; p++) {
                if ((trafienia[o][p] == 1)) {
                    System.out.print("<O>");

                }
                if (trafienia[o][p] != 1) {
                    System.out.print(" - ");
                }
            }
            System.out.println("");
        }
        exit(0);
    }
}
