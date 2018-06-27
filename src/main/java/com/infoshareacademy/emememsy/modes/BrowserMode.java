package com.infoshareacademy.emememsy.modes;


import com.infoshareacademy.emememsy.Actions;
import com.infoshareacademy.emememsy.App;
import com.infoshareacademy.emememsy.InputOutput;
import com.infoshareacademy.emememsy.SingleWord;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BrowserMode extends Mode {

    private static Scanner scanner = new Scanner(System.in); //skaner do wprowadzenia poz menu
    List<SingleWord> myList = new ArrayList<>();

    //konstruktor objektu trybu "ustawiający" jego nazwe i opis ktore z automatu sa wypisywane przez .lounchMode (rodzica)
    public BrowserMode(String modeName, String modeDescriptopn) {
        super(modeName, modeDescriptopn);
    }

    //realizacja menu dla objektu tego trybu (tej klasy)
    public void selectMenu(Integer menuInt) {

        switch (menuInt) {
            case 1:
                //TODO replace sout by Monika's function
                myList = InputOutput.createListOfWords();
                String singleWord = new Actions().pickRandomLearnMode(myList);
                InputOutput.writeToCSV(myList);
                //System.out.println("\n\n\nTu wywolanie funkcji wwywolania pary slowo-tlumaczenie \n\n\n");
                launchMode();
                break;
            case 2:
                App.mainMenu();
                break;
            default:
                System.out.println("Sprobuj jeszcze raz: ");
        }
    }

    // "uruchomienie" trybu - ekran powitalny plus pobranie nr menu od usera
    @Override
    public void launchMode() {
        super.launchMode(); //wywolanie ciala metody klasy-rodzica - wspolnej dla wszystkich obiektow od typu Mode

        // ponizej specyficzne display dla kazdego z trybow tutaj takie:
        System.out.println("\nMasz do wyboru:\n1: Wyswietl slowo-tłumaczenie\n2: Wyjście do Menu Głównego\nWybierz: ");
        selectMenu(scanner.nextInt()); //wprowadzenie usera jako arg bezp do metody selectMenu()
    }
}



