package emememsy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        new App().run();
    }

    private void run() {

        List<SingleWord> myList = new ArrayList<>();

        //test wczytania pliku i stworenia tablicy - uruchomić tylko raz!!!!!


        try {
          myList =  InputOutput.createListOfWords();
        } catch (IOException e) {
            e.printStackTrace();
        }



        //symulacja trybu nauki - uruchamiać ile razy się chce
       // String singleWord = new Actions().pickRandomLearnMode(myList);



        //weryfikacja stanu listy
        myList.stream().forEach(System.out::println);


    }
}
