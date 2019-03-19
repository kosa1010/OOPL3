package pl.edu.ur.oopl3.Zad3_1;

import pl.edu.ur.oopl3.Interfaces.FactorialInterface;

/**
 * Created by mchyl on 28/07/2018.
 */
public class RecursionFactorial implements FactorialInterface{

    // metoda silnia zwraca silnię z liczby przekazanej jako parametr
    // obliczenie silni odbywa się za pomocą rekurencji
    @Override
    public int factorial(int wartosc) {
        // jeśli przekazany parametr jest równy zero to zwróć 1
        // a w przeciwnym wypadku zwróć wartość parametru * wywołanie metody silnia
        // z parametrem o jeden mniejszym
        if (wartosc == 0) return 1;
        else return wartosc * factorial(wartosc - 1);
    }

}