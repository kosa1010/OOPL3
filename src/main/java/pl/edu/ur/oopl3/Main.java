package pl.edu.ur.oopl3;

import pl.edu.ur.oopl3.Zad3_1.RecursionFactorial;

import java.util.Scanner;

/**
 * Created by mchyl on 28/07/2018.
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        // pobieramy od użytkownika liczbę
        int liczba = sc.nextInt();
        RecursionFactorial rc = new RecursionFactorial();

        // wyświetlamy na ekranie obliczoną silnię
        System.out.println(liczba + "! = " + rc.factorial(liczba));
    }
}
