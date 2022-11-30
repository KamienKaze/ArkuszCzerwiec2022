import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n = 60;
        int[] array = new int[n + 1];
        int intToFind;

        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        array = main.fillArray(array);

        System.out.println("Jaką liczbę chcesz znaleźć?");
        intToFind = scanner.nextInt();

        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }

        System.out.println();

        if(main.findInteger(array, intToFind) != -1){
            System.out.println("Znaleziono liczbę!");
        } else {
            System.out.println("Nie znaleziono liczby!");
        }
    }

    private int[] fillArray(int[] array) {

        int max = 100;
        int min = 1;
        int range = max - min + 1;

        for(int i = 0; i < (array.length - 1); i++) {
            array[i] = (int)(Math.random() * range) + min;
        }

        return array;
    }


    //******************************************************
    // nazwa funkcji: findInteger
    // argumenty:
    //  arrayToSearch - jednowymiarowa tablica typu int
    //  intToFind - int
    // typ zwracany: int, indeks szukanego elementu w tablicy, lub w przypadku nie znalezienia elementu: -1
    // informacje:
    //      Funkcja wstawia  na ostatnie miejsce w tablicy szukaną liczbę
    //      i na jej podstawie sprawdza każdy element tablicy. Jeśli
    //      jakiś elemet okaże się równy szukanemu zwracany jest indeks
    //      znalezionego elementu, jeśli nie, funkcja zwraca '-1';
    // autor: 04230703856
    //*****************************************************
    private int findInteger(int[] arrayToSearch, int intToFind) {

        boolean isFound = false;
        int currentPlace = 0;
        int finalPlace = -1;

        arrayToSearch[arrayToSearch.length - 1] = intToFind;

        while(!isFound) {
            if(arrayToSearch[currentPlace] == intToFind) {
                finalPlace = currentPlace;
                isFound = true;
            }

            currentPlace++;
        }

        if(finalPlace == arrayToSearch.length - 1) {
            return -1;
        }

        return finalPlace;
    }
}