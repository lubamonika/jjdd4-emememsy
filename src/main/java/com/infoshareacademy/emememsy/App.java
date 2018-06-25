package com.infoshareacademy.emememsy;

import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        new App().run();
    }

    private void run() {

        List<SingleWord> myList = new ArrayList<>();
        //test wczytania pliku i stworenia tablicy
        try {
            myList = InputOutput.createListOfWords();
        } catch (IOException e) {
            System.out.println("Wystąpił problem z wczytaniem Twojego pliku. Sprawdź czy podałeś poprawną ścieżkę w pliku properties");
        }
        //symulacja trybu nauki
        String singleWord = new Actions().pickRandomLearnMode(myList);
        try {
            InputOutput.writeToCSV(myList);
        } catch (IOException | CsvDataTypeMismatchException | CsvRequiredFieldEmptyException e) {
            System.out.println("Wystąpił problem z zapisaniem zmian. Skontaktuj się z administratorem.");
        }
        //weryfikacja stanu listy
        //myList.stream().forEach(System.out::println);

        //tryb testu

        SingleWord lastPickedWord = new Actions().pickRandomTestMode(myList);
        System.out.println(lastPickedWord.toString());
        lastPickedWord.good();
        System.out.println(lastPickedWord.toString());
        System.out.println(lastPickedWord.getTranslation());


/*        while(czymydzialamyu){

            //weryfikacja trybu testu
            SingleWord lastPickedWord = new Actions().pickRandomTestMode(myList);
            Scanner.in
            switch(inputy)

            case 4:
            lastPickedWord.nieWieział();
            wybierzNast
            break


            case 2:
                lastPickedWord.wieział();
                wybierzNast
                        break
        }*/

    }



}
