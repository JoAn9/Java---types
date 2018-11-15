import java.util.Arrays;
import java.util.Random;

public
    class s19622_zestaw06 {

    public static void main(String[] args) {
        cw_01();
    }

    /*
    I. Dana jest dwuwymiarowa tablica zmiennych typu double opisująca
    położenie punktu w przestrzeni, oraz taka sama dwuwymiarowa
    tablica obrot.

    Wykonaj operację wyliczenia wartości tablicy rezultat przyjmując że
    wynikiem elementu 0, 0 jest suma mnożeń elementów z zerowego wiersza
    tablicy obrót z elementami z zerowej kolumny.
     */

    static public void cw_01() {

        double[][] punkt = {
            {1},
            {0},
            {0}
        };
        double[][] obrot = {
            {0, -1, 0},
            {1, 0, 0},
            {0, 0, 1}
        };
        double[][] rezultat = new double[3][1];

        for(int i = 0; i<obrot.length; i++) {
            int sum = 0;
            for (int j = 0; j<punkt.length; j++) {
                sum += obrot[i][j] * punkt[j][0];
            }
            rezultat[i][0] = sum;
            System.out.println("rezultat " + i + ": " + rezultat[i][0]);
        }
    }
}